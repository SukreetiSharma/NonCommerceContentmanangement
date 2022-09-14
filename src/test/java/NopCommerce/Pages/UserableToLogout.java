package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class UserableToLogout {
    WebDriver driver;
    By Logout = By.xpath("//a[@href='/logout']");

    public UserableToLogout(WebDriver driver) {
        this.driver=driver;
    }

    public void ableToLogout() {
        driver.findElement(Logout).click();
    }

}
