package steps.delivery;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.delivery.DeliveryPage;

public class DeliveryPageDef {
    DeliveryPage deliveryPage = new DeliveryPage();

    @Then("Choose an address for self-pickup")
    public void addressSelect() {
        deliveryPage.addressSelect();
    }

    @Then("Choose a day for self-pickup")
    public void daySelect() {
        deliveryPage.daySelect();
    }

    @Then("Input name in the name field")
    public void inputName() {
        deliveryPage.inputName(UserConfig.USER_NAME);
    }

    @Then("Input email in the email field")
    public void inputLogin() {
        deliveryPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Click on the 'Оформить заказ'")
    public void clickSubmit() {
        deliveryPage.clickSubmit();
    }

    @Then("Message with {string} visible")
    public void messageIsVisible(String text) {
        deliveryPage.messageIsVisible();
    }

}
