package NopCommerce.Pages;

import org.openqa.selenium.WebDriver;

    public class PageFactory {
        WebDriver driver;
        public UserAbleToLogin toLogin;
        public UserabltoAddTopics toAdd;
        public UserableToLogout tologout;

        public PageFactory(WebDriver driver){
            this.driver = driver;
        }
        public UserAbleToLogin getUserAbleToLogin(){
            if(toLogin == null){
                toLogin = new UserAbleToLogin(driver);
            }
            return toLogin;
        }
        public UserabltoAddTopics getUserAbleToadd(){
            if(toAdd == null){
                toAdd = new UserabltoAddTopics(driver);
            }
            return toAdd;
        }
        public UserableToLogout getToLogout(){
            if(tologout == null){
                tologout = new UserableToLogout(driver);
            }
            return tologout;
        }

    }
