package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.MalformedURLException;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private static String baseUrl = "https://belhard.academy/";

    @BeforeMethod
    public void setup() throws MalformedURLException {
        browserSetup();
    }

    protected static void browserSetup() {
        String browserName = System.getProperty("browser", CHROME);
        Configuration.remote = "http://localhost:4444";
        Configuration.browser = browserName;
        open(baseUrl);

    }

    @AfterMethod
    public void closeTab() {
        WebDriverRunner.closeWebDriver();
    }
}

//    @AfterTest
//    public void addEnvData() {
//        File file = new File("target/allure-results/environment.properties");
//        String envVars = "Browser=%s\nBrowser.Version=%s\nStand=%s";
//        Capabilities caps =((RemoteWebDriver)WebDriverRunner.getWebDriver()).getCapabilities();
//        envVars = String.format(envVars, Configuration.browser, caps.getBrowserVersion(), "Prod");
//
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write(envVars);
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


