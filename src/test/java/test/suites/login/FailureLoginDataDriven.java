package test.suites.login;

import app.pages.Login.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.suites.TestBase;
import test.utils.ReadExcelFileUtil;

import java.util.Iterator;

public class FailureLoginDataDriven extends TestBase {

    LoginPage loginPageObj;


    @Test(dataProvider = "failedLoginCredntials")
    public void failedLoginwithInvalidEmailOrInvalidPassord(String email , String password)
    {
        loginPageObj = new LoginPage(driver);
        loginPageObj.enterEmail(email);
        loginPageObj.enterPassword(password);
        loginPageObj.login();
        loginPageObj.verifyLoginErrorMessageWhenInvalidEmailOrPassword(email , password);
        driver.navigate().back();
    }



    @DataProvider(name="failedLoginCredntials")
    public Object[][] failedLoginTestDataProvider()
    {
        ReadExcelFileUtil testDataObj = new ReadExcelFileUtil(System.getProperty("user.dir")+
                "\\src\\test\\resources\\data\\FacebookLogin_TestData.xlsx");

        int rowCount = testDataObj.getRowCount(0);

        Object[][] invalidTestData = new Object[1][2];

        invalidTestData[0][0] = testDataObj.getData(0,1,0);
        invalidTestData[0][1] = testDataObj.getData(0,1,1);

      return invalidTestData;
    }


}
