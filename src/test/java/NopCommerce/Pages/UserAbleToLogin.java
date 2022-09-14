package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UserAbleToLogin {
    WebDriver driver;
    WebDriverWait wait;
    By Login = By.xpath("//button[@class='button-1 login-button']");
    By ContentManagement = By.xpath("(//i[@class='right fas fa-angle-left '])[6]");

    public UserAbleToLogin(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    public void LoginToDashboard(){
        driver.findElement(Login).click();
        driver.findElement(ContentManagement).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='right fas fa-angle-left '])[6]")));
    }
}
