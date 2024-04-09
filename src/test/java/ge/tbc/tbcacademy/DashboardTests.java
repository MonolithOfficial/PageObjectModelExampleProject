package ge.tbc.tbcacademy;

import com.codeborne.selenide.Configuration;
import ge.tbc.tbcacademy.pages.DashboardPage;
import ge.tbc.tbcacademy.pages.FAQPage;
import ge.tbc.tbcacademy.steps.DashboardSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DashboardTests {
    DashboardPage dashboardPage; // declaration of a page object
    DashboardSteps dashboardSteps; // declaration of a step object
    FAQPage faqPage;

    @BeforeClass
    public void setUp(){
        dashboardPage = new DashboardPage(); // initialization of a page object
        dashboardSteps = new DashboardSteps(); // initialization of a step object

        Configuration.browser = "chrome";
        Configuration.timeout = 10;
        Configuration.holdBrowserOpen = true;
        WebDriverManager.chromedriver().setup();
        open("https://swoop.ge");
    }

    @Test
    public void goToSection() {
        dashboardSteps
            .clickDraggableSection(dashboardPage.draggableSection) // visible selector
            .goToFilmAndDoSomething() // invisible selector -> do as you wish ᕦ(ò_óˇ)ᕤ
            .doSomethingAgain("something");
    }
}
