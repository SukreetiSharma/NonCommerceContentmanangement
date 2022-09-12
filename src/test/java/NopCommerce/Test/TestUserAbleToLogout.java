package NopCommerce.Test;

import org.testng.annotations.Test;
import static NopCommerce.Test.BaseClass.pageFactory;

public class TestUserAbleToLogout extends BaseClass {

    @Test
    public void AbleToSearch() throws InterruptedException {
        pageFactory.getToLogout().ableToLogout();
    }

}
