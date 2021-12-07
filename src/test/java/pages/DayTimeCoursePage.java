package pages;

import com.codeborne.selenide.WebDriverRunner;

public class DayTimeCoursePage {

        public static String getPageTitle() {
            return WebDriverRunner.getWebDriver().getTitle();
        }
    }
