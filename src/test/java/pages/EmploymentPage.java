package pages;

import com.codeborne.selenide.WebDriverRunner;

public class EmploymentPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
