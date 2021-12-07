package pages;

import com.codeborne.selenide.WebDriverRunner;

public class KidsCoursePage {
    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
