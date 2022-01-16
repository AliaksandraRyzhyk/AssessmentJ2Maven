package steps.delivery;

import io.cucumber.java.en.Then;
import pages.delivery.MainDeliveryPage;

public class MainDeliveryPageDef {
    MainDeliveryPage mainDeliveryPage = new MainDeliveryPage();

    @Then("Click on the 'Catalog' button")
    public void clickCatalogButton() {
        mainDeliveryPage.clickCatalogButton();
    }

    @Then("Click on the 'Изотоники' button")
    public void checkIsotonicButton() {
        mainDeliveryPage.checkIsotonicButton();
    }

    @Then("Choose a product on the 'Изотоники' section")
    public void selectItem() {
        mainDeliveryPage.selectItem();
    }

}
