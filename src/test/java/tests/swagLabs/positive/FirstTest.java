package tests.swagLabs.positive;



import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.swagLabs.LoginPage;
import pages.swagLabs.PurchasePage;
import tests.base.BasesTest;

import java.io.IOException;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith({TextReportExtension.class})
public class FirstTest extends BasesTest {

    @Test
    @Order(1)
    public void loginTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();


    }

    @Test
    @Order(2)
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

    @Test
    @Order(3)
    public void removePurchaseTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.buttonAddToCart();
        loginPage.messageButtonRemove();
        loginPage.buttonRemove();
        loginPage.messageButtonAddToCart();
    }

    @Test
    @Order(4)
    public void wwpurchaseTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.buttonAddToCart();
        loginPage.buttonCartLink();
        loginPage.welcomeMessageInCart();
//        loginPage.cartButtonRemoves();
    }
}
