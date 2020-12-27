package Class1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class PerANdPostConditionAnnotation {

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        System.out.println("I am before class method");
    }

    @Test (groups = "smoke")
    public void testMethod(){
        System.out.println("I am a Test method");
    }
    @Test (groups = "smoke")
    public void testMethod1(){
        System.out.println("I am a Test method 1 ");
    }
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @AfterClass(alwaysRun = true)

    public void afterClass(){
        System.out.println("I am after class method");
    }


}
