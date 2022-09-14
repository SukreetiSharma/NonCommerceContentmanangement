package NopCommerce.Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestOrderPage extends BaseClass{

    @Test
    public void AbleToSearch() throws IOException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getSearchOrder().orderPage();
        pageFactory.getToLogout().ableToLogout();
    }
}
