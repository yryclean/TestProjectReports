package base;

import com.codeborne.selenide.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.MalformedURLException;

import static com.codeborne.selenide.Browsers.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class TestBase {

    private static String baseUrl = "https://belhard.academy/";

    @BeforeMethod
    public void browserSetup() {
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
    public void closeTab() {
        WebDriverRunner.closeWebDriver();
    }
}



