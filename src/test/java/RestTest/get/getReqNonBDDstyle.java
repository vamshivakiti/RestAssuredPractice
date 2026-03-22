package RestTest.get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class getReqNonBDDstyle {
    @Test
  public void  getReq(){
        //
        RequestSpecification rs= RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/1905");
        rs.log().all();
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);
//        RequestSpecification rs = RestAssured.given();
//        rs.baseUri("https://api.zippopotam.us");
//        rs.basePath("/in/509001").log().all();
//        rs.log().all();
//        rs.when().log().all().get();
//        rs.then().statusCode(200);
    }
}
