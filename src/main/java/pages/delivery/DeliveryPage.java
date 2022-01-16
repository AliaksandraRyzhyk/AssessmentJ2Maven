package pages.delivery;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class DeliveryPage {
    private final SelenideElement deliveryAddress = $x("//label[@for='address_15048']");
    private final SelenideElement deliveryDay = $x("//label[@for='date_2']");
    private final SelenideElement deliveryName = $x("//input[@name='ORDER_PROP_3']");
    private final SelenideElement deliveryLogin = $x("//input[@name='ORDER_PROP_5']");
    private final SelenideElement submit = $x("//a[@class='btn btn_type_flat']");
    private final SelenideElement message = $x("//div[text()='Проверьте корректность внесенных контактных данных']");


    @Step("Выбрать адрес для самовывоза")
    public void addressSelect() {
        deliveryAddress.click();
    }

    @Step("Выбрать день для самовывоза")
    public void daySelect() {
        deliveryDay.click();
    }

    @Step("Ввести {0} в поле Ваше имя")
    public void inputName(String text) {
        deliveryName.val(text);
    }

    @Step("Ввести {0} в поле Ваше email")
    public void inputLogin(String text) {
        deliveryLogin.val(text);
    }

    @Step("Нажать на кнопку Оформить заказ")
    public void clickSubmit() {
        submit.click();
    }

    @Step("Проверить видимость сообщения о некорректно внесенных данных")
    public void messageIsVisible() {
        message.shouldBe(Condition.visible);
    }
}
