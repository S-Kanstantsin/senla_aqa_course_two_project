package tests.swagLabs.positive;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.swagLabs.LoginPage;
import pages.swagLabs.PurchasePage;

import java.io.IOException;
@ExtendWith({TextReportExtension.class})
public class PurchaseTest {

    @Test
    public void purchaseTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        PurchasePage user = new PurchasePage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.buttonAddToCart();
        loginPage.buttonCartLink();
        loginPage.welcomeMessageInCart();
        loginPage.buttonCheckout();
        loginPage.welcomeMessageYourInformation();
        user.userInformationgin();
        user.welcomeMessageOverview();
        user.buttonFinish();
        user.welcomeMessageComplete();
    }
}
