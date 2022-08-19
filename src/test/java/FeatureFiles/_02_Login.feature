Feature: Login Functionality

  Background:
    Given Navigate to parabank

  Scenario: Login with valid username and password

    When Enter username "GRUPOP21" and password "grupop" to log in
    Then User should login successfully

  Scenario Outline: Login with one invalid value for the pair of (username and password)

    When Enter invalid username "<USER>" and password "<PASSW>" to log in
    Then User should not login
    Examples:
      | USER  | PASSW  |
      | GRUPOP21  | asd  |
      | grupas1 | grupop |



