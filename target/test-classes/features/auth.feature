# language: en
@Auth
Feature: Login New User

  Scenario: Successful login new user
    Then Click on the authorization button
    Then Click on the register button
    Then Input User_name in the name field
    Then Input User_email in the email field
    Then Input User_password in the password field
    Then Input User_ConfirmPassword in the confirmPassword field
    Then Click on the 'Register'
    Then Message "Авторизация" is visible