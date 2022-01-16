package pages.promo;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ItemPromoPage {
    private final SelenideElement addToCart = $x("//button[@data-brand='QNT']");
    private final SelenideElement cart = $x("(//div[@class='cart-min-desc']/span[@class='cart__icon'])[1]");

    @Step("Нажать на кнопку 'В корзину'")
    public void addToCart() {
        addToCart.scrollIntoView(false).click();
    }

    @Step("Открыть корзину товаров")
    public void openCart() {
        cart.scrollIntoView(false).click();
    }
}
