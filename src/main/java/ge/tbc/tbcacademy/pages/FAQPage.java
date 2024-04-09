package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// TRY USING SELENIUM FOR PAGE FACTORY DESIGN PATTERN IN A SEPARATE PROJECT
public class FAQPage {
    WebDriver driver;

//    @CacheLookup
    @FindBy(how = How.XPATH, using = "//section[@class='FooterBottom']")
    public SelenideElement footer;

    public FAQPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
