package ge.tbc.tbcacademy;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import ge.tbc.tbcacademy.pages.DashboardPage;
import ge.tbc.tbcacademy.pages.FAQPage;
import ge.tbc.tbcacademy.steps.DashboardSteps;
import ge.tbc.tbcacademy.steps.FAQSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

// TRY USING SELENIUM FOR PAGE FACTORY DESIGN PATTERN IN A SEPARATE PROJECT
public class FAQTests {
    FAQPage faqPage;
    FAQSteps faqSteps;
    @BeforeClass
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10;
        Configuration.holdBrowserOpen = true;
        WebDriverManager.chromedriver().setup();
        open("https://www.swoop.ge/pages/20");
        faqPage = new FAQPage(WebDriverRunner.getWebDriver());
        faqSteps = new FAQSteps();
    }

    @Test
    public void test01() {
        faqSteps.getText(faqPage.footer);
    }
}
