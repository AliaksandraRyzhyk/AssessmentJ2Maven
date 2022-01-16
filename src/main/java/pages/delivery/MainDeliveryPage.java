package pages.delivery;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainDeliveryPage {
    private final SelenideElement catalogButton = $x("(//a[@class='nav__link'])[1]");
    private final SelenideElement isotonicButton = $x("(//a[text()='Изотоники'])[2]");
    private final SelenideElement item = $x("//div[@class='catalog']//a[@class='product__link']");

    @Step("Нажать на кнопку 'Каталог'")
    public void clickCatalogButton() {
        catalogButton.click();
    }

    @Step("Нажать на кнопку 'Изотоники'")
    public void checkIsotonicButton() {
        isotonicButton.click();
    }

    @Step("Выбрать товар на разделе 'Изотоники'")
    public void selectItem() {
        item.scrollIntoView(false).click();
    }
}
