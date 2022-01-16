# language: en
@Promo
Feature: Application of an invalid promo code

  Scenario: Application of an invalid promo code in the cart
    Then Click on the 'Цели' button
    Then Click on the 'Лечение судорог' button
    Then Choose a product on the 'Лечение судорог' section
    Then Click on the 'В корзину'
    Then Click on the cart
    Then Input "No789" in the promo code input line
    Then Click on the 'Применить' button
    Then Content "Промокод не найден." is visible