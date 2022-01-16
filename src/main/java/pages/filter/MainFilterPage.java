package pages.filter;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainFilterPage {
    private final SelenideElement brandButton = $x("(//a[@class='nav__link'])[2]");
    private final SelenideElement ironMaxButton = $x("(//a[text()='IronMaxx'])[2]");


    @Step("Нажать на кнопку 'Бренды'")
    public void clickBrandButton() {
        brandButton.click();
    }

    @Step("Нажать на кнопку бренда 'IronMaxx'")
    public void checkIronMaxxButton() {
        ironMaxButton.click();
    }
}
