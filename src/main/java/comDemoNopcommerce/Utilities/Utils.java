package comDemoNopcommerce.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    WebDriver driver;

    public Utils(WebDriver driver) { this.driver = driver;}

    public WebElement getElement (By Locator){
        WebElement element = driver.findElement(Locator);

        return element;
    }

    public void doClick(By locator) { getElement(locator).click();}
    public void doSendkey(By locator, String value){ getElement(locator).sendKeys(value);}


}
