package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class UserAbleToLogin {
    WebDriver driver;
    By Login = By.xpath("//button[@class='button-1 login-button']");
    By ContentManagement = By.xpath("(//i[@class='right fas fa-angle-left '])[6]");

    public UserAbleToLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginToDashboard() throws InterruptedException {
        driver.findElement(Login).click();
        driver.findElement(ContentManagement).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
