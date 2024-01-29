package tests;

import com.codeborne.selenide.WebDriverRunner;
import utils.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest extends DriverSetup {

    @Before()
    public static void setup() {
        DriverSetup.setVariables();
        DriverSetup.createDriver();
    }

    @After()
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}