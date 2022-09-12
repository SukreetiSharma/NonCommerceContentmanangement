package NopCommerce.Pages;

import org.openqa.selenium.WebDriver;

    public class PageFactory {
        WebDriver driver;
        public UserAbleToLogin toLogin;

        public PageFactory(WebDriver driver){
            this.driver = driver;
        }
        public UserAbleToLogin getUserAbleToLogin(){
            if(toLogin == null){
                toLogin = new UserAbleToLogin(driver);
            }
            return toLogin;
        }

    }
