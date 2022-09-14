package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserabltoAddTopics {
    WebDriver driver;
    By ContentManagement = By.xpath("//p[contains(text(), 'Content management')]");
    By Topics = By.xpath("//p[contains(text(),' Topics (pages)')]");
    By add = By.xpath("//a[@href='/Admin/Topic/Create']");
    By Title = By.xpath("(//input[@class='form-control text-box single-line'])[1]");

    public UserabltoAddTopics(WebDriver driver) {
        this.driver = driver;
    }
    
    public void addTopics(){
        driver.findElement(ContentManagement).click();
        driver.findElement(Topics).click();
        driver.findElement(add).click();
        driver.findElement(Title).sendKeys("New Topics");
    }

}
