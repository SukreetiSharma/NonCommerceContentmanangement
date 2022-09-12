package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAbleToSearchMessageTemlate {
    WebDriver driver;
    By keywords = By.xpath("//input[@class='form-control text-box single-line']");
    By MessageTemplete = By.xpath("//p[contains(text(),' Message templates')]");
    By search = By.xpath("//button[@class='btn btn-primary btn-search']");

    public UserAbleToSearchMessageTemlate(WebDriver driver) {
        this.driver = driver;
    }

    public void Searchmeassage() throws InterruptedException {
        driver.findElement(MessageTemplete).click();
        driver.findElement(keywords).sendKeys("Blog.BlogComment");
        driver.findElement(search).click();
    }
}
