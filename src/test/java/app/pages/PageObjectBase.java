package app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public PageObjectBase(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver , 10 , 1000 );
        PageFactory.initElements(driver , this);
    }

    public void enterText(WebElement element , String text)
    {
        element.clear();
        element.sendKeys(text);
    }

    public void click(WebElement element)
    {
        element.click();
    }

    public void waitElementToBeDisplayed(WebElement element)
    {
      wait.until(ExpectedConditions.visibilityOf(element));
    }


}

