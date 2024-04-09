package ge.tbc.tbcacademy.steps;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.tbcacademy.pages.DashboardPage;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage(); // Could instead be declared in a Test class to expose selectors there.


    public DashboardSteps clickDraggableSection(SelenideElement element){ // selector passed from outside (test method scope)
        element.click();

        // returns this = fluent interface
        return this;
    }

    public DashboardSteps goToFilmAndDoSomething(){
        // Getting the selector from a page object that's initialized within this steps class.
        // Therefore, it won't be visible in the test method.
        dashboardPage.filmLink.click();
        System.out.println("SOMETHING");

        return this;
    }

    public DashboardSteps doSomethingAgain(String something){
        System.out.println(something);

        return this;
    }
}
