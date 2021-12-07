package pages;

import com.codeborne.selenide.WebDriverRunner;

public class ITBusinessEscortPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}