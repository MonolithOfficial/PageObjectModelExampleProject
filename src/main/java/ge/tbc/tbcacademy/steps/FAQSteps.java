package ge.tbc.tbcacademy.steps;

import com.codeborne.selenide.SelenideElement;

public class FAQSteps {
    public FAQSteps getText(SelenideElement element){
        System.out.println(element.getText());

        return this;
    }
}
