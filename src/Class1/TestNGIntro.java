package Class1;

import org.testng.annotations.Test;

public class TestNGIntro {
    @Test(groups = "smoke")

    public void sayHello(){
        System.out.println("Hello");
    }
}
