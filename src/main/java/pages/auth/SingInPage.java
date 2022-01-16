package pages.auth;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SingInPage {
    private final SelenideElement nameInput = $x("//input[@name='USER_NAME']");
    private final SelenideElement loginInput = $x("//input[@name='USER_LOGIN']");
    private final SelenideElement passwordInput = $x("//input[@name='USER_PASSWORD']");
    private final SelenideElement confirmPasswordInput = $x("//input[@name='USER_CONFIRM_PASSWORD']");
    private final SelenideElement submit = $x("//input[@name='Register']");
    private final SelenideElement authMessage = $x("//h1[text()='Авторизация']");

    @Step("Ввести {0} в поле Ваше имя")
    public void inputName(String text) {
        nameInput.val(text);
    }

    @Step("Ввести {0} в поле email")
    public void inputLogin(String text) {
        loginInput.val(text);
    }

    @Step("Ввести {0} в поле пароль")
    public void inputPassword(String text) {
        passwordInput.val(text);
    }

    @Step("Ввести {0} в поле подтверждения пароля")
    public void inputConfirmPassword(String text) {
        confirmPasswordInput.val(text);
    }

    @Step("Нажать на кнопку зарегистрироваться")
    public void clickSubmit() {
        submit.click();
    }

    @Step("Проверка видимости сообщения об успешной авторизации")
    public void messageIsVisible() {
        authMessage.shouldBe(Condition.visible);
    }
}
