package page.object.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import page.object.actions.CommonWebElementsAndActions;

import java.util.List;


public class DevicesPage extends CommonWebElementsAndActions {

    @FindBy(className = "dt_productCards")
    protected List<SelenideElement> productCardsLst;

    @FindBy(xpath = "//div[contains(@class,'totalPriceSticky hideDefault show vertical_view')]/descendant::div[text()='Dodaj do koszyka']")
    protected SelenideElement addToCartBtn;

    @FindBy(xpath = "//div[contains(@class,'totalPriceSticky hideDefault show vertical_view')]//" +
            "div[text()='Do zapłaty na start']/ancestor::div[contains(@class,'StyledPriceInfo-sc')]//div[@class='dt_price_change']")
    protected SelenideElement doZaplatyNaStartTxt;

    @FindBy(xpath = "//div[contains(@class,'totalPriceSticky hideDefault show vertical_view')]//" +
            "div[text()='Do zapłaty miesięcznie']/ancestor::div[contains(@class,'StyledPriceInfo-sc')]//div[@class='dt_price_change']")
    protected SelenideElement doZaplatyMiesiecznieTxt;


}
