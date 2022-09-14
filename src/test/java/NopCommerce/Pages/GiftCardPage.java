package NopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GiftCardPage {
    WebDriver driver;
    WebDriverWait wait;
    By Sales = By.xpath("(//p[contains(text(), 'Sales')])[1]");
    By Giftcard = By.xpath("//p[contains(text(),' Gift cards')]");
    By RecipientName = By.xpath("//input[@name='RecipientName']");
    By Search = By.xpath("//button[@class='btn btn-primary btn-search']");
    By Recipient = By.xpath("//td[contains(text(),'Brenda Lindgren')]");

    public GiftCardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void giftCardPage(){
        driver.findElement(Sales).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Giftcard));
        driver.findElement(Giftcard).click();
        driver.findElement(RecipientName).sendKeys("Brenda Lindgren");
        driver.findElement(Search).click();
        String actual = driver.findElement(Recipient).getText();
        Assert.isTrue(actual.equals("Brenda Lindgren"), "Expected result does not match with actual result");
    }
}
