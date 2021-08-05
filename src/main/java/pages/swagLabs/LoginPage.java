package pages.swagLabs;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage extends BasePage {
    //    SelenideElement loginField = $("#session_email");
//    SelenideElement passwordField = $("#session_password");
    SelenideElement loginField = $(By.id("user-name"));
    SelenideElement passwordField = $(By.id("password"));
    SelenideElement signInButton = $(By.id("login-button"));


    public void login() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        loginField.sendKeys(props.getProperty("user.username"));
        passwordField.sendKeys(props.getProperty("user.password"));
        signInButton.shouldBe(visible).click();
    }

    public void openLoginPage(){
        open("https://www.saucedemo.com/");
    }


}
