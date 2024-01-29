package page.object.actions;

import org.testng.Assert;
import page.object.pages.HomePage;

import static com.codeborne.selenide.Condition.text;


public class HomePageActions extends HomePage {

    public HomePageActions acceptAllCookies() {
        acceptAllBtn.click();
        return this;
    }

    public HomePageActions checkSliderVisibility(){
        Assert.assertTrue(slider.isDisplayed(), logToReport("Slider is not visible"));
        return this;
    }

    public HomePageActions clickUrzadzenia(){
        urzadzeniaBtn.click();
        return this;
    }

    public HomePageActions goToSpecifiedSubGroup(String group, String subgroup) {
        menuSubGroupElementTxt(group, subgroup).click();
        return this;
    }

    public HomePageActions assertCartItemsValue(String noOfItemsInCart){
        cartItems.shouldBe(text(noOfItemsInCart));
        return this;
    }


}
