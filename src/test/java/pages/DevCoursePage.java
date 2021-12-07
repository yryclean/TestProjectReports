package pages;

import com.codeborne.selenide.WebDriverRunner;

public class DevCoursePage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}