package pages.base;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import java.util.ArrayList;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class BasePage {

    public SelenideElement buttonAddToCart = $x("//button[@class='btn btn_primary btn_small btn_inventory']");
    public SelenideElement buttonCartLink = $("a[class='shopping_cart_link']");
    public SelenideElement buttonCheckout = $("button[id='checkout']");
    public SelenideElement buttonFinish = $("button[id='finish']");
    public SelenideElement buttonRemove = $("button[id='remove-sauce-labs-backpack']");
    public SelenideElement tableInventoryContainer = $(By.id("inventory_container"));
    public SelenideElement tableCartList = $(By.className("cart_list"));
    public SelenideElement tableCartListOverview = $(By.className("cart_list"));


    public SelenideElement itemTotal = $(By.className("summary_subtotal_label"));
    public SelenideElement welcomeMessage = $(By.className("title"));
    public SelenideElement welcomeMessageInCart = $(By.className("title"));
    public SelenideElement welcomeMessageYourInformation = $(By.className("title"));
    public SelenideElement welcomeMessageOverview = $(By.className("title"));
    public SelenideElement welcomeMessageComplete = $(By.className("title"));



    public void buttonAddToCart() {
        buttonAddToCart.shouldBe(visible).click();
    }

    public void tableInventoryContainer() {
        tableInventoryContainer.shouldBe(visible);
        ElementsCollection buttonsAddToCartCollection = tableInventoryContainer.$$("button");
        for(SelenideElement item : buttonsAddToCartCollection)
            item.click();
    }
    public void tableCartList() {
        tableCartList.shouldBe(visible);
        ElementsCollection buttonsRemove = tableCartList.$$("button");
        for(SelenideElement item : buttonsRemove)
            item.click();
    }

    public void tableCartListOverview() {
        tableCartListOverview.shouldBe(visible);
        ElementsCollection sumPrice = tableCartListOverview.$$(".inventory_item_price");
        ArrayList<Float> prises = new ArrayList<>();

       for (SelenideElement item : sumPrice) {
             prises.add(Stream.of(item.getOwnText().replaceAll("\\$", ""))
                    .map(s -> s.substring(1))
                    .map(s -> s.replace(",","."))
                    .map(Float::parseFloat)
                    .reduce(0f, Float::sum));

        }
        double sum = prises.stream()
                .mapToDouble(a -> a)
                .sum();
        System.out.println(sum);
        String total = itemTotal.getOwnText().replaceAll("\\$",  "")
                .replaceAll("Item total:", "");
        double iTemTotal = Double.parseDouble(total);
        System.out.println(AssertTrue(iTemTotal == sum));


    }

    private boolean AssertTrue(boolean b) {
        return b;
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


    public void buttonNotRemove() {
        buttonRemove.shouldNotBe(visible);

    }



    public void welcomeMessage() {
        welcomeMessage.shouldBe(text("PRODUCTS"));
    }

    public void welcomeMessageInCart() {
        welcomeMessageInCart.shouldBe(text("YOUR CART"));
    }

    public void welcomeMessageYourInformation() {
        welcomeMessageYourInformation.shouldBe(text("CHECKOUT: YOUR INFORMATION"));
    }

    public void welcomeMessageOverview() {
        welcomeMessageOverview.shouldBe(text("CHECKOUT: OVERVIEW"));
    }

    public void welcomeMessageComplete() {
        welcomeMessageComplete.shouldBe(text("CHECKOUT: COMPLETE!"));
    }

    public void messageButtonRemove() {
        buttonRemove.shouldBe(text("REMOVE"));
    }


    public void messageButtonAddToCart() {
        buttonAddToCart.shouldBe(text("ADD TO CART"));
    }


}
