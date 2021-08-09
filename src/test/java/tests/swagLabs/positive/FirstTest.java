package tests.swagLabs.positive;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.swagLabs.LoginPage;
import pages.swagLabs.PurchasePage;
import tests.base.BasesTest;

import java.io.IOException;


@ExtendWith({TextReportExtension.class})
public class FirstTest extends BasesTest {

    @Test
    public void loginTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();


    }








}
