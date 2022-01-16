package pages.promo;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPromoPage {
    private final SelenideElement goal = $x("(//a[@class='nav__link'])[3]");
    private final SelenideElement treatment = $x("(//a[text()='Лечение судорог'])[2]");
    private final SelenideElement item = $x("(//img[@class='product__img'])[2]");


    @Step("Нажать на кнопку 'Цели'")
    public void clickGoal() {
        goal.click();
    }

    @Step("Нажать на ссылку 'Лечение судорог'")
    public void checkTreatment() {
        treatment.click();
    }

    @Step("Нажать на товар в разделе 'Лечение судорог'")
    public void selectItem() {
        item.click();
    }
}
