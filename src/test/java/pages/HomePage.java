package pages;

import com.codeborne.selenide.WebDriverRunner;

public class HomePage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
