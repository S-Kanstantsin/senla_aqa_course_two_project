package tests.swagLabs.positive;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.swagLabs.LoginPage;

import java.io.IOException;

@ExtendWith({TextReportExtension.class})
public class DeletAllProductsTest {
    @Test
    public void deletAllProductsTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.tableInventoryContainer();
        loginPage.buttonCartLink();
        loginPage.welcomeMessageInCart();
        loginPage.tableCartList();
        loginPage.buttonNotRemove();
    }
}
