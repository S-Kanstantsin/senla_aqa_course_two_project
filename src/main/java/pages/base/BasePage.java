package pages.base;

import com.codeborne.selenide.Condition;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static java.util.stream.StreamSupport.stream;

public class BasePage {

    public SelenideElement buttonAddToCart = $x("//button[@class='btn btn_primary btn_small btn_inventory']");
    public SelenideElement buttonCartLink = $("a[class='shopping_cart_link']");
    public SelenideElement buttonCheckout = $("button[id='checkout']");
    public SelenideElement buttonFinish = $("button[id='finish']");
    public SelenideElement buttonRemove = $("button[id='remove-sauce-labs-backpack']");
    public SelenideElement tableInventoryContainer = $(By.id("inventory_container"));
    public SelenideElement tableCartList = $(By.className("cart_list"));
    public SelenideElement tableCartListOverview = $(By.className("cart_list"));



    public SelenideElement welcomeMessage = $(By.className("title"));
    public SelenideElement welcomeMessageInCart = $(By.className("title"));
    public SelenideElement welcomeMessageYourInformation = $(By.className("title"));
    public SelenideElement welcomeMessageOverview = $(By.className("title"));
    public SelenideElement welcomeMessageComplete = $(("title"));



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


//        Stream.of(item.getOwnText().replaceAll("\\$", ""))
//                .map(s -> s.substring(1))
//                .mapToInt(Integer::parseInt)
//                .sum()
//                .ifPresent(System.out::println);
        ArrayList<String> prises = new ArrayList<>();
        //List<String> price = new ArrayList<>();
        for (SelenideElement item : sumPrice) {
            prises.add(item.getOwnText().replaceAll("\\$", ""));

        }
//        Stream<String> streamFromArrays = Arrays.stream(prises());
        System.out.println(prises);
//                 Stream.of(streamFromArrays)
//               .map(s -> s.substring(1))
//                .mapToInt(Integer::parseInt)
//                .sum()
//                .ifPresent(System.out::println);
    }




//    public void buttonsAddToCart() {
//        buttonsAddToCart.shouldBe(visible);
//    }

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
