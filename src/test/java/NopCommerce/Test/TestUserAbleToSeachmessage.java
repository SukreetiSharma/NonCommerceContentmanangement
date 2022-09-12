package NopCommerce.Test;

import org.testng.annotations.Test;

public class TestUserAbleToSeachmessage extends BaseClass {

    @Test
    public void AbleToSearch() throws InterruptedException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getToSearchMeassage().Searchmeassage();
        pageFactory.getToLogout().ableToLogout();
    }
}
