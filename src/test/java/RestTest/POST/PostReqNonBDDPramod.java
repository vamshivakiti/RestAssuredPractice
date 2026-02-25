package RestTest.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.testng.annotations.Test;

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
                "        \"checkout\" : \"2026-03-005\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);
      Response resp=  r.when().log().all().post();
        String responseBody = resp.asString();
        System.out.println(responseBody);
        ValidatableResponse vr =resp.then();
        vr.statusCode(200);

    }
}