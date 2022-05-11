package app.pages.Home;

import app.pages.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePO extends PageObjectBase {


    @FindBy(how = How.XPATH , using = "//div[@class= 'bcvklqu9 nzypyw8j']/span")
            public WebElement HomePageWelcomeMessage;

    public HomePO(WebDriver driver)
    {
        super(driver);
    }

}
