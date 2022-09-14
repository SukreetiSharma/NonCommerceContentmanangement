package NopCommerce.Pages;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class UserAbleToLogin {
    WebDriver driver;
    WebDriverWait wait;
    By Email = By.xpath("//input[@name='Email']");
    By Password = By.xpath("//input[@name='Password']");
    By Login = By.xpath("//button[@class='button-1 login-button']");
    By Dashboard = By.xpath("//p[contains(text(),' Dashboard')]");

    public UserAbleToLogin(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    public void LoginToDashboard() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//NopCommerce//TestData//NopCommerce.xls";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HSSFWorkbook wb = new HSSFWorkbook(prop1);
        HSSFSheet sheet = wb.getSheet("Sheet1");
        String email = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(Email).clear();
        driver.findElement(Password).clear();
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(Login).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Dashboard));
    }
}
