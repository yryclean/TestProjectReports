package pages;

import com.codeborne.selenide.WebDriverRunner;

public class IntensiveCoursePage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
