package Class1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class PerANdPostConditionAnnotation {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class method");
    }

    @Test
    public void testMethod(){
        System.out.println("I am a Test method");
    }
    @Test
    public void testMethod1(){
        System.out.println("I am a Test method 1 ");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class method");
    }


}
