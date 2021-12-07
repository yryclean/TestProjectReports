package pages;

import com.codeborne.selenide.WebDriverRunner;

public class VacancyPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
