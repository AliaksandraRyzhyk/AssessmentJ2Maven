# language: en
@Delivery
Feature: Delivery Item

  Scenario: Unsuccessful attempt to register the delivery item
    Then Click on the 'Catalog' button
    Then Click on the 'Изотоники' button
    Then Choose a product on the 'Изотоники' section
    Then Add on 1 unit of the selected product
    Then Click on the 'В корзину' button
    Then Open cart
    Then Click on the 'Оформить заказ' button
    Then Choose an address for self-pickup
    Then Choose a day for self-pickup
    Then Input name in the name field
    Then Input email in the email field
    Then Click on the 'Оформить заказ'
    Then Message with "Проверьте корректность внесенных контактных данных" visible