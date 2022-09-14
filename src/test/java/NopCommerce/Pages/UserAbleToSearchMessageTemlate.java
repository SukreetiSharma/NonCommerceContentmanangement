package NopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAbleToSearchMessageTemlate {
    WebDriver driver;
    By keywords = By.xpath("//input[@class='form-control text-box single-line']");
    By MessageTemplete = By.xpath("//p[contains(text(),' Message templates')]");
    By search = By.xpath("//button[@class='btn btn-primary btn-search']");
    By BlogComment = By.xpath("//td[contains(text(),'Blog.BlogComment')]");

    public UserAbleToSearchMessageTemlate(WebDriver driver) {
        this.driver = driver;
    }

    public void Searchmeassage(){
        driver.findElement(MessageTemplete).click();
        driver.findElement(keywords).sendKeys("Blog.BlogComment");
        driver.findElement(search).click();
        String actual = driver.findElement(BlogComment).getText();
        Assert.isTrue(actual.equals("Blog.BlogComment"), "Expected result does not match with actual result");
    }
}
