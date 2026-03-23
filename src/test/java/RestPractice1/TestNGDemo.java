package RestPractice1;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Description("TC 1 - Verify get method")
    @Test
    void GetReq(){
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/path")
                .when().get().then().statusCode(200);

    }
}
