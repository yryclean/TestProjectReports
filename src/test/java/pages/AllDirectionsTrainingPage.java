package pages;

import com.codeborne.selenide.WebDriverRunner;

public class AllDirectionsTrainingPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
