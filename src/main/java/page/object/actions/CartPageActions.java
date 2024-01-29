package page.object.actions;

import page.object.pages.CartPage;
import utils.SessionObjects;

import static com.codeborne.selenide.Condition.text;


public class CartPageActions extends CartPage {

    public CartPageActions assertPrices(){
        platnoscNaStartTxt.shouldBe(text(SessionObjects.getPlatnoscNaStart()));
        miesiecznieZRabatamiTxt.shouldBe(text(SessionObjects.getOplataMiesieczna()));
        return this;
    }

    public CartPageActions backToHomePage(){
        logo.click();
        return this;
    }




}
