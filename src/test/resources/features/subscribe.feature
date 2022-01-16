# language: en
@Subscribe
Feature: Subscribe For New User

  Scenario: Successful subscribing for a new user
    Then Input email to subscribe in the email field
    Then Click on the 'Подписаться' button
    Then Content with "Спасибо" visible