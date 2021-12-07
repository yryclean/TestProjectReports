package pages;

import com.codeborne.selenide.WebDriverRunner;

public class ForeignersLearningPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
