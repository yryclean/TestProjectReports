package pages;

import com.codeborne.selenide.WebDriverRunner;

public class GameDevCoursePage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
