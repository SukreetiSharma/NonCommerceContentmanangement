package NopCommerce.Test;

import org.testng.annotations.Test;

public class TestUserAbleToLogin extends BaseClass {

    @Test
    public void AbleToSearch(){
        pageFactory.getUserAbleToLogin().LoginToDashboard();
    }
}
