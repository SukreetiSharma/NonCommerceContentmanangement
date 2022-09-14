package NopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OrderPage {
    WebDriver driver;
    WebDriverWait wait;
    By Sales = By.xpath("(//p[contains(text(), 'Sales')])[1]");
    By order = By.xpath("//p[contains(text(),' Orders')]");
    By StartDate = By.xpath("//input[@name='StartDate']");
    By BillingEmailAddres = By.xpath("//input[@name='BillingEmail']");
    By Search = By.xpath("//button[@class='btn btn-primary btn-search']");
    By CustomerEmail = By.xpath("//a[contains(text(),'victoria_victoria@nopCommerce.com')]");
    By Title = By.xpath("//h1[contains(text(),'Orders')]");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void orderPage(){
        driver.findElement(Sales).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(order));
        driver.findElement(order).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Title));
        driver.findElement(StartDate).sendKeys("03/13/2017");
        driver.findElement(BillingEmailAddres).sendKeys("victoria_victoria@nopCommerce.com");
        driver.findElement(Search).click();
        String actual = driver.findElement(CustomerEmail).getText();
        Assert.isTrue(actual.equals("victoria_victoria@nopCommerce.com"), "Expected result does not match with actual result");
    }
}
