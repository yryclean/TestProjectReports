package tests;

import base.ScreenshotListener;
import base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

import static base.Groups.SMOKE;

@Listeners({ScreenshotListener.class})
public class HeaderTest extends TestBase {
    @Test(groups = SMOKE,priority = 0, description = "Click on Online Courses link")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Click on link and verify correct page is opened")
    public void onlineCoursesLinkTest() {

        HeaderPage.clickOnlineCourseLink();

        Assert.assertEquals(VirtualClassPage.getPageTitle(), "Виртуальные классы");
    }

    @Test(groups = SMOKE, priority = 1, description = "Click on Day Time Courses link")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Click on link, move cursor and verify correct page is opened")
    public void DayTimeCoursesTest() {

        HeaderPage.goToDayTimeCourses();

        Assert.assertEquals(DayTimeCoursePage.getPageTitle(), "Дневные онлайн курсы в Академии BELHARD в Минске");

    }

    @Test(groups = SMOKE, priority = 2)
    public void ManageAndBATest() {

        HeaderPage.goToManageAndBA();

        Assert.assertEquals(ManageBaPage.getPageTitle(), "Онлайн курсы управление и бизнес-анализ в сфере разработки ПО в Минске");
    }

    @Test(groups = SMOKE)
    public void ItBusinessEscortTest() {

        HeaderPage.goToItBusinessEscort();

        Assert.assertEquals(ITBusinessEscortPage.getPageTitle(), "Онлайн курсы сопровождение it бизнеса в Минске");

    }

    @Test(groups = SMOKE)
    public void DevelopmentCourseTest() {

        HeaderPage.goToDevCourse();

        Assert.assertEquals(DevCoursePage.getPageTitle(), "Онлайн курсы программирования в Минске с трудоустройством");

    }

    @Test(groups = SMOKE)
    public void GameDevCourseTest() {

        HeaderPage.goToGameDevCourse();

        Assert.assertEquals(GameDevCoursePage.getPageTitle(), "Онлайн курсы по разработке игр с нуля, школа разработки игр");

    }

    @Test(groups = SMOKE)
    public void MarketingDevTest() {

        HeaderPage.goToMarketingDev();

        Assert.assertEquals(MarketingDevPage.getPageTitle(), "Онлайн курсы маркетинга, рекламы в Минске");

    }

    @Test(groups = SMOKE)
    public void AdminAndSecurityTest() {

        HeaderPage.goToAdminAndSecurity();

        Assert.assertEquals(AdminSecurityPage.getPageTitle(), "Онлайн курсы информационной безопасности и DevOps Системный инженер в Минске");

    }

    @Test(groups = SMOKE)
    public void SoftSkillsTest() {

        HeaderPage.goToSoftSkills();

        Assert.assertEquals(SoftSkillsPage.getPageTitle(), "Онлайн курсы развития гибких навыков Soft-Skills для IT-специалистов");

    }

    @Test(groups = SMOKE)
    public void IntensiveCourseTest() {

        HeaderPage.goToIntensiveCourse();

        Assert.assertEquals(IntensiveCoursePage.getPageTitle(), "Интенсивные онлайн курсы: маркетинг, реклама, программирование, разработка ПО, IT в Минске");

    }

    @Test(groups = SMOKE)
    public void EntrepreneursProposalTest() {

        HeaderPage.goToEntrepreneursProposal();

        Assert.assertEquals(EntrepreneurProposalPage.getPageTitle(), "Интенсивные онлайн курсы: маркетинг, реклама, программирование, разработка ПО, IT в Минске");

    }

    @Test(groups = SMOKE)
    public void HomepageTest() {

        HeaderPage.clickHomePageLabel();

        Assert.assertEquals(HomePage.getPageTitle(), "IT курсы онлайн в Минске с возможностью трудоустройства - Академия BELHARD");

    }

    @Test(groups = SMOKE)
    public void KidsCourseTest() {

        HeaderPage.clickItCourse4Kids();

        Assert.assertEquals(KidsCoursePage.getPageTitle(), "Онлайн курсы программирования для детей от 7 до 15 лет в Минске");

    }

    @Test(groups = SMOKE)
    public void AllDirectionsTrainingTest() {

        HeaderPage.goTotTraining4AllDirections();

        Assert.assertEquals(AllDirectionsTrainingPage.getPageTitle(), "Стажировка в Академии BELHARD");

    }
    @Test(groups = SMOKE)
    public void TrainingBATest() {

        HeaderPage.goToTraining4BA();

        Assert.assertEquals(TrainingBAPage.getPageTitle(), "Стажировка для бизнес-аналитиков в сфере разработки ПО");

    }
    @Test(groups = SMOKE)
    public void TrainingHR() {

        HeaderPage.goToTrainingHR();

        Assert.assertEquals(TrainingHRPage.getPageTitle(), "Стажировка для IT-рекрутеров в Академии BELHARD");

    }
    @Test(groups = SMOKE)
    public void EmploymentTest() {

        HeaderPage.clickEmploymentLink();

        Assert.assertEquals(EmploymentPage.getPageTitle(), "Трудоустройство Академии BELHARD");

    }
    @Test(groups = SMOKE)
    public void CorporateLearningTest() {

        HeaderPage.clickCorporateLearningLink();

        Assert.assertEquals(CorporateLearningPage.getPageTitle(), "Корпоративные ИТ-курсы онлайн в Минске");

    }
    @Test(groups = SMOKE)
    public void ForeignersLearningTest() {

        HeaderPage.clickForeignersLearning();

        Assert.assertEquals(ForeignersLearningPage.getPageTitle(), "IT курсы онлайн в Москве и всей России - Академия BELHARD");

    }
    @Test(groups = SMOKE)
    public void ContactsTest() {

        HeaderPage.goToContacts();

        Assert.assertEquals(ContactsPage.getPageTitle(), "Контакты Академии BELHARD");

    }

    @Test(groups = SMOKE)
    public void VacancyTest() {

        HeaderPage.goToVacancy();

        Assert.assertEquals(VacancyPage.getPageTitle(), "Вакансии");

    }
}