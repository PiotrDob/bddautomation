package page.object.actions;

import com.codeborne.selenide.impl.SelenidePageFactory;
import utils.GlobalDefinitions;

import static com.codeborne.selenide.WebDriverRunner.driver;


public class CommonWebElementsAndActions extends GlobalDefinitions {

    public CommonWebElementsAndActions() {
        SelenidePageFactory selenidePageFactory = new SelenidePageFactory();
        selenidePageFactory.initElements(driver(),null,this, CommonWebElementsAndActions.class.getGenericInterfaces());
    }

    public static String logToReport(String textToLog) {
        LOGGER.info(textToLog);
        System.out.println(textToLog);
        return textToLog;
    }


}


