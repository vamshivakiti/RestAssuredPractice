package testNg;

import org.testng.annotations.*;

public class AnnotationsDemo {
    @BeforeSuite
    void Demo1(){
        System.out.println("1");
    }
    @BeforeTest
    void Demo2(){
        System.out.println("2");
    }
    @BeforeClass
    void Demo3(){
        System.out.println("3");
    }
    @BeforeMethod
    void Demo4(){
        System.out.println("4");
    }
    @Test
    void TestDemo(){
        System.out.println("Test case");
    }
    @AfterMethod
    void Demo5(){
        System.out.println("5");
    }

  @BeforeClass
    void Demo6(){
      System.out.println("6");
  }
  @AfterTest
    void Demo7(){
      System.out.println("7");
  }
    @AfterSuite
    void Demo8(){
        System.out.println("8");
    }


}
