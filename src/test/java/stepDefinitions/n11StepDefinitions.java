package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;

public class n11StepDefinitions {
    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());

    @When("Kategorilere Tıklanır.")
    public void kategorilereTıklanır() {
        n11Pages.kategoritıklma();
    }

}
