package pages;

import com.codeborne.selenide.WebDriverRunner;

public class TrainingHRPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
