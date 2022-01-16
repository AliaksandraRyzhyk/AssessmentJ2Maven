package pages.promo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CartPromoPage {
    private final SelenideElement inputPromo = $x("//input[@class='coupon_value']");
    private final SelenideElement submit = $x("//input[@type='submit']");
    private final SelenideElement resultMessage = $x("//div[text()='Промокод не найден. ']");

    @Step("Ввести {0} в строку введения промокода")
    public void enterText(String text) {
        inputPromo.scrollIntoView(false).setValue(text);
    }

    @Step("Нажать на кнопку 'Применить'")
    public void submit() {
        submit.click();
    }

    @Step("Зафиксировать полученный результат")
    public void getResultMessage() {
        resultMessage.shouldBe(Condition.visible);
    }
}
