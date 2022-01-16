package pages.subscribe;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SubscribePage {
    private final SelenideElement subscribeEmail = $x("//input[@class='subscribe-email']");
    private final SelenideElement subscribeButton = $x("//span[text()='Подписаться']");
    private final SelenideElement subscribeMessage = $x("//h1[text()='Спасибо!']");

    @Step("Ввести {0} в поле подписки на акции и новинки магазина")
    public void enterText(String text) {
        subscribeEmail.val(text);
    }

    @Step("Нажать на кнопку 'Подписаться'")
    public void clickSubscribe() {
        subscribeButton.click();
    }

    @Step("Проверить видимость сообщения об успешности оформления подписки")
    public void contentIsVisible() {
        subscribeMessage.shouldBe(Condition.visible);
    }
}
