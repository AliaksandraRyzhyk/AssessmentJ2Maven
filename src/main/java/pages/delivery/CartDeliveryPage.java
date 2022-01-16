package pages.delivery;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CartDeliveryPage {
    private final SelenideElement order = $x("//a[text()='Оформить заказ']");

    @Step("Нажать на кнопку 'Оформить заказ'")
    public void orderToItem(){
        order.click();
    }
}
