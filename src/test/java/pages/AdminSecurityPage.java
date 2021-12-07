package pages;

import com.codeborne.selenide.WebDriverRunner;

public class AdminSecurityPage {
    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}