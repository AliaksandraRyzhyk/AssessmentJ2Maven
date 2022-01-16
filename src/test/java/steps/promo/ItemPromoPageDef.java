package steps.promo;

import io.cucumber.java.en.Then;
import pages.promo.ItemPromoPage;

public class ItemPromoPageDef {
    ItemPromoPage itemPromoPage = new ItemPromoPage();


    @Then("Click on the 'В корзину'")
    public void addToCart() {
        itemPromoPage.addToCart();
    }

    @Then("Click on the cart")
    public void openCart() {
        itemPromoPage.openCart();
    }
}
