package steps.filter;

import io.cucumber.java.en.Then;
import pages.filter.ItemFilterPage;

public class ItemFilterPageDef {
    ItemFilterPage itemFilterPage = new ItemFilterPage();

    @Then("Choose the 'Протеины' section")
    public void clickProteinButton() {
        itemFilterPage.clickProteinButton();
    }

    @Then("Message {string} visible")
    public void contentWithNumberIsVisible(String text) {
        itemFilterPage.getMessageNumber();
    }
}
