package pages;

import com.codeborne.selenide.WebDriverRunner;

public class VirtualClassPage {
    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
