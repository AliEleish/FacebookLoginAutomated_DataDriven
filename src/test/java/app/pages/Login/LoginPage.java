package app.pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class LoginPage extends LoginPO{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void enterEmail(String email)
    {
        waitElementToBeDisplayed(EmailTextField);
       enterText(EmailTextField , email);
    }

    public void enterPassword(String password)
    {
      waitElementToBeDisplayed(PasswordTextField);
      enterText(PasswordTextField,password);
    }

    public void login()
    {
        waitElementToBeDisplayed(LoginButton);
        click(LoginButton);
    }

    public void verifyLoginErrorMessageWhenInvalidEmailOrPassword(String email , String password)
    {
        waitElementToBeDisplayed(WrongEmailOrPasswordErrorMessage);
        assertTrue(WrongEmailOrPasswordErrorMessage.getText().contains("The password that you've entered is incorrect."));
    }
}
