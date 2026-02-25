package RestTest;

import com.aventstack.extentreports.gherkin.model.Given;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class helloChrome {
    public static void main(String[] args) {
      RestAssured
              .given()
              .baseUri("https://restful-booker.herokuapp.com/")
              .basePath("/ping")
              .when().get().then().statusCode(201);

    }
}
