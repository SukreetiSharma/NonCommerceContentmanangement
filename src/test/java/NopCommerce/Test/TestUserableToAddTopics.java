package NopCommerce.Test;

import org.testng.annotations.Test;

public class TestUserableToAddTopics extends BaseClass {

    @Test
    public void AbleToSearch() throws InterruptedException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getUserAbleToadd().addTopics();
        pageFactory.getToLogout().ableToLogout();
    }
}
