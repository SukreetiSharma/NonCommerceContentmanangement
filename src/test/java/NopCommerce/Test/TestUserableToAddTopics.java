package NopCommerce.Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestUserableToAddTopics extends BaseClass {

    @Test
    public void AbleToSearch() throws IOException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getUserAbleToadd().addTopics();
        pageFactory.getToLogout().ableToLogout();
    }
}
