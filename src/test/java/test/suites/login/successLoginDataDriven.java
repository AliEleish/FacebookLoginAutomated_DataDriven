package test.suites.login;

import app.pages.Home.HomePage;
import app.pages.Login.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.suites.TestBase;
import test.utils.ReadExcelFileUtil;

public class successLoginDataDriven extends TestBase {

    LoginPage loginPageObj;
    HomePage homePageObj;


    @Test(dataProvider = "validCredentials")
    public void successfulLogin(String email , String password)
    {
        loginPageObj = new LoginPage(driver);
        loginPageObj.enterEmail(email);
        loginPageObj.enterPassword(password);
        loginPageObj.login();
        homePageObj = new HomePage(driver);
        homePageObj.verifyHomeWelcomeMessage();
    }



    @DataProvider(name = "validCredentials")
    public Object[][] validTestDataFeed()
    {
        ReadExcelFileUtil testDataObj = new ReadExcelFileUtil(System.getProperty("user.dir")+
                "\\src\\test\\resources\\data\\FacebookLogin_TestData.xlsx");
        Object[][] credential = new Object[1][2];

        credential[0][0] = testDataObj.getData(0 , 0 , 0);
        credential[0][1] = testDataObj.getData(0,0,1);

        return credential;

    }





}
