package page.object.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import page.object.actions.CommonWebElementsAndActions;


public class CartPage extends CommonWebElementsAndActions {

    @FindBy(xpath = "//div[@data-qa='BKT_TotalupFrontCurrCOde']")
    protected SelenideElement platnoscNaStartTxt;

    @FindBy(xpath = "//div[@data-qa='BKT_TotalMonthlyCurrCOde']")
    protected SelenideElement miesiecznieZRabatamiTxt;

    @FindBy(css = "[alt='T-Mobile - przejdź na stronę główną']")
    protected SelenideElement logo;


}
