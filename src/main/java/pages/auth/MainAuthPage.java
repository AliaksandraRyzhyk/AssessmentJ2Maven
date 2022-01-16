package pages.auth;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class MainAuthPage {
    private final SelenideElement auth = $x("//a[@class='auth']");
    private final SelenideElement authButton = $x("//a[@class='btn-text']");

    @Step("Нажать на кнопку авторизации")
    public void clickAuthButton() {
        auth.click();
    }

    @Step ("Нажать на кнопку зарегистироваться")
    public void clickLoginButton() {
        authButton.click();
    }

}
