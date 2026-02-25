package RestTest.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class PostReqDemo {
@Test
    public void bddStylePostReq(){

        String BaseUri="https://restful-booker.herokuapp.com";
        String BasePath = "/booking";
        String payLoad = "{\n" +
                "    \"firstname\" : \"Dhanu\",\n" +
                "    \"lastname\" : \"V\",\n" +
                "    \"totalprice\" : 100000,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2026-02-29\",\n" +
                "        \"checkout\" : \"2026-03-01\"\n" +
                "    },";

        RestAssured.given()
                .baseUri(BaseUri)
                .basePath(BasePath)
                .contentType(ContentType.JSON).log().all().body(payLoad)
                .when().post()
                .then().log().all().statusCode(200);





    }
}
