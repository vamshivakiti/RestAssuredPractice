package RestTest.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class PutReqNonBDD {

    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;

    String token = "549461ff0d61ff6";
    String bookingid = "596";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";
    @Test
    public  void PUTReq(){
java.lang.String BASE_PATH_Updated =BASE_PATH+"/"+bookingid;
System.out.println(BASE_PATH_Updated);
String payload = "{\n" +
        "    \"firstname\" : \"VVk\",\n" +
        "    \"lastname\" : \"Vakity\",\n" +
        "    \"totalprice\" : 250,\n" +
        "    \"depositpaid\" : true,\n" +
        "    \"bookingdates\" : {\n" +
        "        \"checkin\" : \"2026-03-01\",\n" +
        "        \"checkout\" : \"2026-03-05\"\n" +
        "    },\n" +
        "    \"additionalneeds\" : \"Breakfast\"\n" +
        "}";
    r.baseUri(BASE_URL);
    r.basePath(BASE_PATH_Updated);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();
        response = r.when().log().all().put();
        vr = response.then().log().all();
        vr.statusCode(200);
        vr.body("firstname", Matchers.equalTo("VVk"));
        vr.body("lastname", Matchers.equalTo("Vakity"));
    }
}
