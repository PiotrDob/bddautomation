package page.object.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.object.actions.CommonWebElementsAndActions;


public class HomePage extends CommonWebElementsAndActions {

    @FindBy(xpath = "//span[text()='Zaakceptuj wszystkie']")
    protected SelenideElement acceptAllBtn;

    @FindBy(className = "slick-list")
    protected SelenideElement slider;

    @FindBy(xpath = "//button[text()='Urządzenia']")
    protected SelenideElement urzadzeniaBtn;

    @FindBy(xpath = "//div[contains(@class,'header')]/a[@data-ma='menu-basket']/div")
    protected SelenideElement cartItems;

    protected WebElement menuSubGroupElementTxt(String group, String subGroup){
       return $((By.xpath(" //p[text()='" + group + "']/parent::li//child::span[text()='" + subGroup + "']")));
    }

}
