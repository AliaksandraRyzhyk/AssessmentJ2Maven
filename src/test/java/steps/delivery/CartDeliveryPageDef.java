package steps.delivery;

import io.cucumber.java.en.Then;
import pages.delivery.CartDeliveryPage;

public class CartDeliveryPageDef {
    CartDeliveryPage cartDeliveryPage = new CartDeliveryPage();

    @Then("Click on the 'Оформить заказ' button")
    public void orderToItem() {
        cartDeliveryPage.orderToItem();
    }
}
