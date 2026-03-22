package RestPractice1;

import io.restassured.RestAssured;

public class FirstPing {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/path")
                .when().get().then().statusCode(201);

      }
}
