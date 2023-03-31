package comDemoNopcommerce.Test;

import comDemoNopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.reflect.generics.repository.GenericDeclRepository;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    By registerLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By Gend = By.id("gender-male");
    By FName = By.id("FirstName");
    By LName = By.id("LastName");
    By Day = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By Month = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By Year = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By Emails = By.id("Email");
    By Company = By.id("Company");
    By Pass = By.id("Password");
    By ConfirmPass = By.id("ConfirmPassword");
    By register = By.xpath("//*[@id=\"register-button\"]");


    public RegisterPage(WebDriver driver) {
        this.driver=driver;
        utils = new Utils(driver);
    }
//
//    public void ClickRecaptcha () {
//        ReCaptcha_click reCaptcha_click = new ReCaptcha_click();
//    }
    public void clickOnRegisterLink() { utils.doClick(registerLink);}

    public void clickOnRegister() { utils.doClick(register);}

    public void clickOnGender() { utils.doClick(Gend);}

    public void doRegister(String gender, String firstName, String lastName, String dayDOB, String monthDOB, String yearDOB, String email, String companyName, String Password, String ConfirmPassword) {
        utils.doSendkey(Gend, gender);
        utils.doSendkey(FName, firstName);
        utils.doSendkey(LName, lastName);
        utils.doSendkey(Day, dayDOB);
        utils.doSendkey(Month, monthDOB);
        utils.doSendkey(Year, yearDOB);
        utils.doSendkey(Emails, email);
        utils.doSendkey(Company, companyName);
        utils.doSendkey(Pass, Password );
        utils.doSendkey(ConfirmPass, ConfirmPassword );

    }

}
