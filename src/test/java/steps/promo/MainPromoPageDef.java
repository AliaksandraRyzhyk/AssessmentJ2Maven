package steps.promo;

import io.cucumber.java.en.Then;
import pages.promo.MainPromoPage;

public class MainPromoPageDef {
    MainPromoPage mainPromoPage = new MainPromoPage();

    @Then("Click on the 'Цели' button")
    public void clickGoal() {
        mainPromoPage.clickGoal();
    }

    @Then("Click on the 'Лечение судорог' button")
    public void checkTreatment() {
        mainPromoPage.checkTreatment();
    }

    @Then("Choose a product on the 'Лечение судорог' section")
    public void selectItem() {
        mainPromoPage.selectItem();
    }
}

