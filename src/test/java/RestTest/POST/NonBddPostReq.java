package RestTest.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

public class NonBddPostReq {
Response response;
    @Test
    void nonBddReq(){
        String BaseUri="https://restful-booker.herokuapp.com";
        String BasePath = "/booking";
        String payLoad = "{\n" +
                "    \"firstname\" : \"Dhanvi\",\n" +
                "    \"lastname\" : \"V\",\n" +
                "    \"totalprice\" : 100,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2026-02-28\",\n" +
                "        \"checkout\" : \"2026-03-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"PoolAccess\"                        \n" +
                "}";
        RequestSpecification r = RestAssured
                //given
                .given();
        r.baseUri(BaseUri);
        r.basePath(BasePath);
        r.contentType(ContentType.JSON).log().all();
        r.body(payLoad);
        //when
      r.when().log().all().post();

        //then
        r.then().log().all().statusCode(200);

    }

}
