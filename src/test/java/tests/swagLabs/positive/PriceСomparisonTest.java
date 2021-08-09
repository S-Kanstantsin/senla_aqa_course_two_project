package tests.swagLabs.positive;


import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.swagLabs.LoginPage;
import pages.swagLabs.PurchasePage;

import java.io.IOException;
@ExtendWith({TextReportExtension.class})
public class PriceСomparisonTest {

    @Test
    public void priceСomparisonTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        PurchasePage user = new PurchasePage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.tableInventoryContainer();
        loginPage.buttonCartLink();
        loginPage.welcomeMessageInCart();
        loginPage.buttonCheckout();
        loginPage.welcomeMessageYourInformation();
        user.userInformationgin();
        user.welcomeMessageOverview();
        user.tableCartListOverview();
    }
}
