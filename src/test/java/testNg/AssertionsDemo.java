package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
    @Test
    void asssertions(){
        // Soft Assertion:
        SoftAssert s = new SoftAssert();
        s.assertEquals("Vamshi","vamshi","Not equal");
        System.out.println("End of program");
       // Hard Assertion
        Assert.assertEquals("vamshi","Vamshi");
        System.out.println("End of program");
    }
}
