package pages;

import com.codeborne.selenide.WebDriverRunner;

public class SoftSkillsPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}