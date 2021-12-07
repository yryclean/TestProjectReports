package pages;

import com.codeborne.selenide.WebDriverRunner;

public class TrainingBAPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
