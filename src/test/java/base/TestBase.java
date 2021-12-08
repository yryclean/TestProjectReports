package base;

import com.codeborne.selenide.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import static com.codeborne.selenide.Browsers.*;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private static String baseUrl = "https://belhard.academy/";
    @BeforeMethod
    public void browserSetup() throws InterruptedException {
        String browser = java.lang.System.getProperties().getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            Configuration.browser = CHROME;
        } else if (browser.equalsIgnoreCase("firefox")) {
            Configuration.browser = FIREFOX;
        } else if (browser.equalsIgnoreCase("safari")) {
            Configuration.browser = SAFARI;
        }
        open(baseUrl);
    }

    @AfterMethod
    public void closeTab() throws InterruptedException {
        Selenide.closeWebDriver();
    }
}



