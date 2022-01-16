package pages.filter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ItemFilterPage {
    private final SelenideElement proteinButton = $x("(//label[@class='checkbox__label'])[1]");
    private final SelenideElement number = $x("//div[text()='Найдено 6 товаров']");


    @Step("Нажать на категорию 'Протеины'")
    public void clickProteinButton(){
        proteinButton.click();
    }

    @Step("Определить количество найденных товаров")
    public void getMessageNumber() {
        number.shouldBe(Condition.visible);
    }
}
