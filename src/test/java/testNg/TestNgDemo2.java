package testNg;

import io.restassured.RestAssured;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 {
    @BeforeTest
    void setUp(){
        System.out.println("Open browser");
    }
    @AfterTest
    void tearDown(){

        System.out.println("close browser");
    }
    @Test()
    void TC1(){
        System.out.println("Rest ful booker test1");
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/ping")
                .when()
                .get().then().statusCode(201);
    }

    }

