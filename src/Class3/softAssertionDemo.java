package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class softAssertionDemo {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite annotation");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite annotation");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("i am before test annotation");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("i am after test annotation");
    }

    @BeforeMethod(alwaysRun = true)
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    @Test(groups = "regression")
    public void logoAndValidLogin(){
        //verifying that logo is displayed
        WebElement element = driver.findElement(By.xpath("//div[@id = 'divLogo']//img"));
        //creting an object of soft assertion
        SoftAssert softAsert=new SoftAssert();
        softAsert.assertTrue(!element.isDisplayed(),"Logo is not displayed");
        //entering valid credentials to login
        String username="Admin";
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        //validating that we ar logged in
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));

        softAsert.assertTrue(welcomeMessage.isDisplayed(), "Welcome message is not displayed");
        softAsert.assertEquals(welcomeMessage.getText(), "Welcome "+username, "Welcome text is not matching");
        System.out.println("End of the test case");
        softAsert.assertAll();
    }
    @Test(groups = {"smoke","sprint2"})
    public void simpleTest(){
        System.out.println("Hello from the simple test");
    }

}

