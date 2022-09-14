package NopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UserAbleToSearchMessageTemlate {
    WebDriver driver;
    WebDriverWait wait;
    By ContentManagement = By.xpath("//p[contains(text(), 'Content management')]");
    By keywords = By.xpath("//input[@class='form-control text-box single-line']");
    By MessageTemplete = By.xpath("//p[contains(text(),' Message templates')]");
    By search = By.xpath("//button[@class='btn btn-primary btn-search']");
    By BlogComment = By.xpath("//td[contains(text(),'Blog.BlogComment')]");

    public UserAbleToSearchMessageTemlate(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void Searchmeassage(){
        driver.findElement(ContentManagement).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),' Message templates')]")));
        driver.findElement(MessageTemplete).click();
        driver.findElement(keywords).sendKeys("Blog.BlogComment");
        driver.findElement(search).click();
        String actual = driver.findElement(BlogComment).getText();
        Assert.isTrue(actual.equals("Blog.BlogComment"), "Expected result does not match with actual result");
    }
}
