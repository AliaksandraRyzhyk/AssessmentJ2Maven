package pages.delivery;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ItemDeliveryPage {
    private final SelenideElement counter = $x("//span[@class='counter__btn counter__btn_plus']");
    private final SelenideElement addToCart = $x("//button[@data-brand='QNT']");
    private final SelenideElement cart = $x("(//div[@class='cart-min-desc']/span[@class='cart__icon'])[1]");


    @Step("Увеличить количество товара на 1 единицу")
    public void addNumber() {
        counter.click();
    }

    @Step("Нажать на кнопку 'В корзину'")
    public void addToCart() {
        addToCart.scrollIntoView(false).click();
    }

    @Step("Открыть корзину товаров")
    public void openCart() {
        cart.scrollIntoView(false).click();
    }
}
