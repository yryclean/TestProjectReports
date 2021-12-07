package pages;

import com.codeborne.selenide.WebDriverRunner;

public class ContactsPage {
    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
