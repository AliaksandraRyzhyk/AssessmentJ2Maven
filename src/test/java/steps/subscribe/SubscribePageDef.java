package steps.subscribe;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.subscribe.SubscribePage;

public class SubscribePageDef {
    SubscribePage subscribePage = new SubscribePage();

    @Then("Input email to subscribe in the email field")
    public void inputSubscribeEmail() {
        subscribePage.enterText(UserConfig.USER_LOGIN);
    }

    @Then("Click on the 'Подписаться' button")
    public void clickSubscribeButton() {
        subscribePage.clickSubscribe();
    }

    @Then("Content with {string} visible")
    public void contentIsVisible(String text) {
        subscribePage.contentIsVisible();
    }
}
