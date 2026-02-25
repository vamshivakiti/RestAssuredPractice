package RestTest.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class patchDemo {

    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;

    String token = "549461ff0d61ff6";
    String bookingid = "596";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";
@Test
    void patchDemoReq(){
        java.lang.String BASE_PATH_Updated =BASE_PATH+"/"+bookingid;
        System.out.println(BASE_PATH_Updated);
        String payload =  "{\n" +
                "\"firstname\" : \"Veltoori\"\n" +
                "}";
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH_Updated);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();
        response = r.when().log().all().patch();
        vr = response.then().log().all();
        vr.statusCode(200);
        vr.body("firstname", Matchers.equalTo("Veltoori"));
    }
}
