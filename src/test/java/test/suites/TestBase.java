package test.suites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

   protected WebDriver driver;

    @BeforeClass
    public void setPreconditions()
    {
        String directory = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver" , directory);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");

        //System.out.println(directory);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
//    public static void main(String[] args)
//    {
//        TestBase TB = new TestBase();
//        TB.setPreconditions();
//
//    }
}
