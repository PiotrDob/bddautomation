package tests.frontend;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.Scenario;
import utils.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest extends DriverSetup {

    @Before()
    public static void setup(Scenario scenario) {
        if (!scenario.getSourceTagNames().contains("@RestAPI")) {
            DriverSetup.setVariables();
            DriverSetup.createDriver();
        }

    }

    @After()
    public static void tearDown(Scenario scenario) {
        if (!scenario.getSourceTagNames().contains("@RestAPI")) {
            WebDriverRunner.closeWebDriver();
        }
    }
}