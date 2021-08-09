package tests.swagLabs.positive;

import com.codeborne.selenide.junit5.TextReportExtension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.swagLabs.LoginPage;

import java.io.IOException;
@ExtendWith({TextReportExtension.class})
public class КemovePurchaseTest {

    @Test
    public void removePurchaseTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.buttonAddToCart();
        loginPage.messageButtonRemove();
        loginPage.buttonRemove();
        loginPage.messageButtonAddToCart();
    }
}
