package utils;


import org.testng.log4testng.Logger;

public class GlobalDefinitions {
    protected static final String BASE_URL = System.getProperty("baseurl", "https://www.t-mobile.pl/");
    protected static final String HEADLESS = System.getProperty("headless", "false");
    protected static final String BROWSER = System.getProperty("browser", "chrome");
    public static final Logger LOGGER = Logger.getLogger(GlobalDefinitions.class);


}
