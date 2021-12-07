package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HeaderPage {
    private static By OnlineCourseLink = By.xpath("//a[@class='t-menu__link-item']");
    private static By homePageLabel = By.cssSelector("div#nav346409563 [href='/'] ");
    private static By itCourseDropdown = By.cssSelector("a[href='#submenu:more2']");
    private static By dayTimeCourses = By.cssSelector("a[class='t794__typo t-name t-name_xs'][href='https://belhard.academy/daycourses']");
    private static By manageAndBA = By.cssSelector("div#rec346409564 [href='https://belhard.academy/businessanalysis']");
    private static By itBusinessEscort = By.cssSelector("div#rec346409564 [href='https://belhard.academy/itbusiness']");
    private static By devCourse = By.cssSelector("div#rec346409564 [href='https://belhard.academy/developmentpo']");
    private static By gameDev = By.cssSelector("div#rec346409564 [href='https://belhard.academy/gamedevelopment']");
    private static By marketingDev = By.cssSelector("div#rec346409564 [href='https://belhard.academy/marketing']");
    private static By adminAndSecurity = By.cssSelector("div#rec346409564 [href='https://belhard.academy/security']");
    private static By softSkills = By.cssSelector("div#rec346409564 [href='https://belhard.academy/sskills']");
    private static By intensiveCourse = By.cssSelector("div#rec346409564 [href='https://belhard.academy/intensive']");
    private static By entrepreneursProposal = By.cssSelector("div#rec346409564 [href='https://belhard.academy/entrepreneurs']");
    private static By itCourse4Kids = By.cssSelector("div#nav346409563 [href='/teens']");
    private static By trainingDropdown = By.cssSelector("div#nav346409563 [href='#submenu:more']");
    private static By training4AllDirections = By.cssSelector("div#rec346409565 [href='https://belhard.academy/internship'] ");
    private static By training4BA = By.cssSelector("div#rec346409565 [href='https://belhard.academy/internshipba'] ");
    private static By training4HR = By.cssSelector("div#rec346409565 [href='https://belhard.academy/internshiphr'] ");
    private static By employment = By.cssSelector("div#nav346409563 [href='/employment'] ");
    private static By corporateLearning = By.cssSelector("div#nav346409563 [href='/corporate']");
    private static By foreignersLearning = By.cssSelector("div#nav346409563 [href='https://belhard.academy/ru']");
    private static By contactsDropDown = By.cssSelector("div#nav346409563 [href='#submenu:more3']");
    private static By contacts = By.cssSelector("div#rec346409566 [href='/contact']");
    private static By vacancy = By.cssSelector("div#rec346409566 [href='/vacancy']");

    public HeaderPage() {
    }

    public static void clickItCourse4Kids() {
        $(itCourse4Kids).click();
    }

    public static void clickForeignersLearning() {
        $(foreignersLearning).click();
    }

    public static void clickCorporateLearningLink() {
        $(corporateLearning).click();
    }

    public static void clickEmploymentLink() {
        $(employment).click();
    }

    public static void clickHomePageLabel() {
        $(homePageLabel).click();
    }
    public static void clickOnlineCourseLink() {
        $(OnlineCourseLink).click();
    }

    public static void goToDayTimeCourses() {
        actions().moveToElement($(itCourseDropdown)).click($(dayTimeCourses))
                .perform();
        for (String handles :  getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToManageAndBA() {
        actions().moveToElement($(itCourseDropdown)).click($(manageAndBA))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }

    }

    public static void goToItBusinessEscort() {
        actions().moveToElement($(itCourseDropdown)).click($(itBusinessEscort))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToDevCourse() {
        actions().moveToElement($(itCourseDropdown)).click($(devCourse))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);

        }
    }

    public static void goToGameDevCourse() {
        actions().moveToElement($(itCourseDropdown)).click($(gameDev))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToMarketingDev() {
        actions().moveToElement($(itCourseDropdown)).click($(marketingDev))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToAdminAndSecurity() {
        actions().moveToElement($(itCourseDropdown)).click($(adminAndSecurity))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToSoftSkills() {
        actions().moveToElement($(itCourseDropdown)).click($(softSkills))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToIntensiveCourse() {
        actions().moveToElement($(itCourseDropdown)).click($(intensiveCourse))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToEntrepreneursProposal() {
        actions().moveToElement($(itCourseDropdown)).click($(entrepreneursProposal))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goTotTraining4AllDirections() {
        actions().moveToElement($(trainingDropdown)).click($(training4AllDirections))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToTraining4BA() {
        actions().moveToElement($(trainingDropdown)).click($(training4BA))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToTrainingHR() {
        actions().moveToElement($(trainingDropdown)).click($(training4HR))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToContacts() {
        actions().moveToElement($(contactsDropDown)).click($(contacts))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }

    public static void goToVacancy() {
        actions().moveToElement($(contactsDropDown)).click($(vacancy))
                .perform();
        for (String handles : getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(handles);
        }
    }
}