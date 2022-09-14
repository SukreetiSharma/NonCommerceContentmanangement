package NopCommerce.Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestUserAbleToSeachmessage extends BaseClass {

    @Test
    public void AbleToSearch() throws IOException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getToSearchMeassage().Searchmeassage();
        pageFactory.getToLogout().ableToLogout();
    }
}
