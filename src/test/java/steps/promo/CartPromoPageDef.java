package steps.promo;

import io.cucumber.java.en.Then;
import pages.promo.CartPromoPage;

public class CartPromoPageDef {
    CartPromoPage cartPromoPage = new CartPromoPage();

    @Then("Input {string} in the promo code input line")
    public void enterText(String text) {
        cartPromoPage.enterText(text);
    }

    @Then("Click on the 'Применить' button")
    public void submit() {
        cartPromoPage.submit();
    }

    @Then("Content {string} is visible")
    public void getResultMessage(String text) {
        cartPromoPage.getResultMessage();
    }
}
