package RestTest.get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class getRequestBody {
@Test
    public  void getReqBody(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/509001")
                .when().get()
                .then().log().all()
                .statusCode(200);
    }
}
