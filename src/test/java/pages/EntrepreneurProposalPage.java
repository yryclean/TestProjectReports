package pages;

import com.codeborne.selenide.WebDriverRunner;

public class EntrepreneurProposalPage {

    public static String getPageTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}

