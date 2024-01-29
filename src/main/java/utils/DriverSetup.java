package utils;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;


public class DriverSetup extends GlobalDefinitions {

    public static void createDriver() {
       try {
           open(BASE_URL);
           getWebDriver().manage().window().maximize();
           getWebDriver().manage().deleteAllCookies();
       } catch (Throwable e) {
           if (getWebDriver() != null) {
               closeWebDriver();
           }
           throw e;
        }
    }


    public static void setVariables() {
        Configuration.timeout = 5000L;
        Configuration.baseUrl = BASE_URL;
        Configuration.fastSetValue = true; // If set to true, sets value by javascript instead of using Selenium built-in "sendKey" function
        Configuration.savePageSource = false; //  Defines if Selenide saves page source on failing tests.
        Configuration.headless = Boolean.valueOf(HEADLESS);
        Configuration.browser = BROWSER;
        switch(BROWSER) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
                break;
            case "firefox":
                // TODO CONFIG FOR FF
                break;
        }

    }

}
