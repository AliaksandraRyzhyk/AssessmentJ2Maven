package steps.delivery;

import io.cucumber.java.en.Then;
import pages.delivery.ItemDeliveryPage;

public class ItemDeliveryPageDef {
    ItemDeliveryPage itemDeliveryPage = new ItemDeliveryPage();

    @Then("Add on 1 unit of the selected product")
    public void addNumberItem() {
        itemDeliveryPage.addNumber();
    }

    @Then("Click on the 'В корзину' button")
    public void addToCart() {
        itemDeliveryPage.addToCart();
    }

    @Then("Open cart")
    public void openCart() {
        itemDeliveryPage.openCart();
    }
}

