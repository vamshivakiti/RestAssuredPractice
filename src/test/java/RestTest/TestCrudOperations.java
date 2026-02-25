package RestTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCrudOperations {
    String token;
    String bookingID;
    @BeforeTest
    String testCreateToken(){
        token="123";
        return token;
    }
    @Test(priority = 1)
    void createGetTokenandBooking(){
        token=testCreateToken();
        bookingID="456";
    }
    @Test(priority = 2)
    void testputReq(){
        System.out.println(token);
        System.out.println(bookingID);
    }
    @Test(priority = 3)
    void deleteBooking(){
        System.out.println(token);
        System.out.println(bookingID);
    }
    @Test(priority = 4)
    void getBooking(){
        System.out.println(bookingID);
    }

}
