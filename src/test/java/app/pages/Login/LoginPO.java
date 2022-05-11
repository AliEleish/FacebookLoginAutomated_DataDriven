package app.pages.Login;

import app.pages.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPO extends PageObjectBase {

    @FindBy(how = How.ID , using = "email")
    public WebElement EmailTextField;

    @FindBy(how = How.ID , using = "pass")
    public WebElement PasswordTextField;

    @FindBy(how = How.NAME , using ="login")
    public WebElement LoginButton;

    @FindBy(how = How.CLASS_NAME , using = "_9ay7")
    public WebElement WrongEmailOrPasswordErrorMessage;

public LoginPO(WebDriver driver)
{
    super(driver);
}


}
