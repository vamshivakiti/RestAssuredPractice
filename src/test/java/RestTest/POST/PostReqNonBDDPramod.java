package RestTest.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class PostReqNonBDDPramod {
    RequestSpecification r = RestAssured
            .given();
    Response response;
    ValidatableResponse validatableResponse;

    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void testNonBDDStylePOSTPositive() {

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "{\n" +
                "    \"firstname\" : \"VamshiKrishna\",\n" +
                "    \"lastname\" : \"Vakiti\",\n" +
                "    \"totalprice\" : 250,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2026-03-01\",\n" +
                "        \"checkout\" : \"2026-03-05\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);
      Response resp=  r.when().log().all().post();

        validatableResponse =resp.then().log().all();
        validatableResponse.statusCode(200);

        String responseBody = resp.asString();
        System.out.println(responseBody);
        // 3 Ways You can verify the response

        // 1. RA - Matchers
        validatableResponse.body("booking.firstname", Matchers.equalTo("VamshiKrishna"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Vakiti"));

        //  2. TestNG Asserts -
        //  Assert.assertEquals(firstNameResponse,"Pramod");
        String firstNameResponse = response.then().log().all().extract().path("firstname");
        Assert.assertEquals(firstNameResponse,"VamshiKrishna");

        // 3 TestNG Assertion with JSON Path Lib
        JsonPath jsonPath = new JsonPath(responseBody);
        String firstNameJSONPathExtracted = jsonPath.getString("firstname");
        String lastNameJSONPathExtracted = jsonPath.getString("lastname");
        Integer totalpriceJSONPathExtracted = jsonPath.getInt("totalprice");
        String checkinDate = jsonPath.getString("bookingdates.checkin");

        Assert.assertEquals(firstNameJSONPathExtracted,"VamshiKrishna");
        Assert.assertEquals(lastNameJSONPathExtracted,"Vakiti");
        Assert.assertEquals(totalpriceJSONPathExtracted,250);
        Assert.assertEquals(checkinDate,"2026-03-01");
        Assert.assertNotNull(totalpriceJSONPathExtracted);
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new EdgeDriver();
        //        // JSON Array Response
//        String checkin = jsonPath.getString("[0][\"bookingdates\"][\"checkin\"]");
//        System.out.println(checkin);

    }
}