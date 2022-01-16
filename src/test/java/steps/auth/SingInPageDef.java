package steps.auth;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.auth.SingInPage;

public class SingInPageDef {
    SingInPage singInPage = new SingInPage();


    @Then("Input User_name in the name field")
    public void inputName() {
        singInPage.inputName(UserConfig.USER_NAME);
    }

    @Then("Input User_email in the email field")
    public void inputLogin() {
        singInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input User_password in the password field")
    public void inputPassword() {
        singInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Input User_ConfirmPassword in the confirmPassword field")
    public void inputConfirmPassword() {
        singInPage.inputConfirmPassword(UserConfig.USER_CONFIRM_PASSWORD);
    }

    @Then("Click on the 'Register'")
    public void clickSubmit() {
        singInPage.clickSubmit();
    }

    @Then("Message {string} is visible")
    public void messageIsVisible(String text) {
        singInPage.messageIsVisible();
    }
}
