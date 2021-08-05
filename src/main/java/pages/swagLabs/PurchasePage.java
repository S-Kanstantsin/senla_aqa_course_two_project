package pages.swagLabs;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class PurchasePage extends BasePage {

    SelenideElement firstName = $(By.id("first-name"));
    SelenideElement lastName = $(By.id("last-name"));
    SelenideElement postalCode = $(By.id("postal-code"));
    SelenideElement buttonContinue = $(By.id("continue"));



    public void userInformationgin() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        firstName.sendKeys(props.getProperty("user.first_Name"));
        lastName.sendKeys(props.getProperty("user.last_Name"));
        postalCode.sendKeys(props.getProperty("user.postal_Code"));
        buttonContinue.shouldBe(visible).click();
    }

}
