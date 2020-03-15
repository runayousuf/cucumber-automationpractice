package cucumber.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.EveningDressesPage;
import pageobject.NavigationPage;

public class NavigationSteps {
    @Given("I mousehover 'WOMEN' tab.")
    public void mousehover_tab() {
        new NavigationPage(CommonSteps.getDriver()).hoverOverWomenTab();

    }

    @Given("I click on 'EVENING DRESSES' tab in navigation menu.")
    public void click_on_tab_in_navigation_menu() {
        new NavigationPage(CommonSteps.getDriver()).clickOnEveningDressesLink();
    }

    @Then("I verify'EVENING DRESSES' title displays.")
    public void title_displays() {
        new EveningDressesPage(CommonSteps.getDriver()).getEveningPageTitle();
    }
}
