package NopCommerce.Test;

import org.testng.annotations.Test;

public class TestUserAbleToLogout extends BaseClass {

    @Test
    public void AbleToSearch(){
        pageFactory.getToLogout().ableToLogout();
    }
}
