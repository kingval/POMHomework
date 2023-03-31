package comDemoNopCommerce;

import comDemoNopcommerce.Base.BaseInfo;
import comDemoNopcommerce.Test.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Properties;

public class RegisterPageTest {

    WebDriver driver;
    BaseInfo baseInfo = new BaseInfo();
    Properties prop = new Properties();
    RegisterPage registerPage;

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        baseInfo = new BaseInfo();
        prop = baseInfo.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = baseInfo.initialiseDriver(webEngine);
        driver.get(prop.getProperty("URL"));
        registerPage = new RegisterPage(driver);
        Thread.sleep(3000);



    }

    @Test
    public void RegisterPageTest() throws InterruptedException {

//        Thread.sleep(15000);
//        driver.findElement(By.xpath("//*[@id=\"cf-stage\"]/div[6]/label/span")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("label[class='ctp-checkbox-label']")).click();
//        Thread.sleep(3000);

        registerPage.clickOnRegisterLink();
        registerPage.clickOnGender();
        registerPage.doRegister(prop.getProperty("gender"), prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("dayDOB"), prop.getProperty("monthDOB"), prop.getProperty("yearDOB"), prop.getProperty("email"), prop.getProperty("companyName"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword"));
        registerPage.clickOnRegister();
        Thread.sleep(3000);
    }

//    @AfterMethod
//    public void closeBrowser(){
//        driver.close();
//    }


}


/*

yearDOB = 1989
email = king.valand@gmail.com
companyName = UnifyTesting
Password = Tester123!
ConfirmPassword = Tester123!


 */