package pages;

import com.codeborne.selenide.WebDriverRunner;

public class CorporateLearningPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
