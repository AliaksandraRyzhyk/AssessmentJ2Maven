package steps.auth;

import io.cucumber.java.en.Then;
import pages.auth.MainAuthPage;

public class MainAuthPageDef {
    MainAuthPage mainPage = new MainAuthPage();

    @Then("Click on the authorization button")
    public void clickAuthButton() {
        mainPage.clickAuthButton();
    }

    @Then("Click on the register button")
    public void clickLoginButton() {
        mainPage.clickLoginButton();
    }
}
