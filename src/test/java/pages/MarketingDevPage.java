package pages;

import com.codeborne.selenide.WebDriverRunner;

public class MarketingDevPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}