package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.sun.corba.se.impl.orbutil.closure.Constant;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasePage {

    public SelenideElement buttonAddToCart = $(By.id("add-to-cart-sauce-labs-backpack"));
    public SelenideElement buttonCartLink = $("a[class='shopping_cart_link']");
    public SelenideElement buttonCheckout = $("button[id='checkout']");
    public SelenideElement buttonFinish = $("button[id='finish']");
    public SelenideElement buttonRemove = $("button[id='remove-sauce-labs-backpack']");
    public ElementsCollection cartButtonRemoves = $$(By.className("btn btn_secondary btn_small cart_button"));

    public SelenideElement welcomeMessage = $(By.className("title"));
    public SelenideElement welcomeMessageInCart = $(By.className("title"));
    public SelenideElement welcomeMessageYourInformation = $(By.className("title"));
    public SelenideElement welcomeMessageOverview = $(By.className("title"));
    public SelenideElement welcomeMessageComplete = $(By.className("title"));

    public void buttonAddToCart() {
        buttonAddToCart.shouldBe(visible).click();
    }

    public void buttonCartLink() {
        buttonCartLink.shouldBe(visible).click();
    }

    public void buttonCheckout() {
        buttonCheckout.shouldBe(visible).click();
    }

    public void buttonFinish() {
        buttonFinish.shouldBe(visible).click();
    }

    public void buttonRemove() {
        buttonRemove.shouldBe(visible).click();
    }



    public void welcomeMessage() {
        welcomeMessage.shouldBe(Condition.text("PRODUCTS"));
    }

    public void welcomeMessageInCart() {
        welcomeMessageInCart.shouldBe(Condition.text("YOUR CART"));
    }

    public void welcomeMessageYourInformation() {
        welcomeMessageYourInformation.shouldBe(Condition.text("CHECKOUT: YOUR INFORMATION"));
    }

    public void welcomeMessageOverview() {
        welcomeMessageOverview.shouldBe(Condition.text("CHECKOUT: OVERVIEW"));
    }

    public void welcomeMessageComplete() {
        welcomeMessageComplete.shouldBe(Condition.text("CHECKOUT: COMPLETE!"));
    }

    public void messageButtonRemove() {
        buttonRemove.shouldBe(Condition.text("REMOVE"));
    }

    public void messageButtonAddToCart() {
        buttonAddToCart.shouldBe(Condition.text("ADD TO CART"));
    }


}
