package steps.filter;

import io.cucumber.java.en.Then;
import pages.filter.MainFilterPage;

public class MainFilterPageDef {
    MainFilterPage mainFilterPage = new MainFilterPage();


    @Then("Click on the 'Бренды' button")
    public void clickBrandButton() {
        mainFilterPage.clickBrandButton();
    }

    @Then("Click on the 'IronMaxx' button")
    public void checkIronMaxxButton() {
        mainFilterPage.checkIronMaxxButton();
    }
}
