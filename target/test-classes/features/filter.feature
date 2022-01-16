# language: en
@Filter
Feature: Filter to sort items

  Scenario: Successful using a filter to sort items
    Then Click on the 'Бренды' button
    Then Click on the 'IronMaxx' button
    Then Choose the 'Протеины' section
    Then Message "Найдено 6 товаров" visible