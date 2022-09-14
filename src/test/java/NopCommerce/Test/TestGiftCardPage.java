package NopCommerce.Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestGiftCardPage extends BaseClass{

    @Test
    public void AbleToSearchGift() throws IOException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getSearchGiftCard().giftCardPage();
        pageFactory.getToLogout().ableToLogout();
    }
}
