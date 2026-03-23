package RestPractice1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestFullCRUD {
    //CRUD
    //Create Booking
    //Create Auth--> Token
    //PUT --> ID, Toke
    //Delete--> ID
    //Get ID -- Verify should not exist.
   String token;
   Integer bookingId;

   public String getToken(){
       token ="123";
       return token;
   }
   @BeforeTest
   public void getTokenAndBookingID(){
      token=getToken();
      //POST req
       //POST code---
       bookingId=321;
   }
   @Test
   public void testPutreq(){
       System.out.println(token);
       System.out.println(bookingId);
       //PUT Code...
   }
   @Test
   public void testDeleteReq(){
       System.out.println(token);
       System.out.println(bookingId);
       //Delete Code
   }

}
