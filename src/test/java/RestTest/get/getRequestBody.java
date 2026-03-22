package RestTest.get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class getRequestBody {
@Test
    public  void getReqBody(){
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1905")
                .when().get()
                .then().log().all()
                .statusCode(200);
    }
}
