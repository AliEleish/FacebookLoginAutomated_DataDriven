package app.pages.Home;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class HomePage extends HomePO{

    public  HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void verifyHomeWelcomeMessage()
    {
        waitElementToBeDisplayed(HomePageWelcomeMessage);
        assertTrue(HomePageWelcomeMessage.getText().contains("Welcome to Facebook,"));
    }
}
