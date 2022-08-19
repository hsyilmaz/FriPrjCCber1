Feature: Bill Payment Functionality

  Background:
    Given Navigate to parabank
    When Enter username "GRUPOP21" and password "grupop" to log in
    Then User should login successfully
    And Navigate to Bill pay page

  Scenario Outline: Pay all the bills
    When Enter payee name as "<Billtype>" and money as "<amount>"
    Then User should pay successfully
    Examples:
      | Billtype | amount |
      | Elektrik | 85     |
      | Su       | 45     |
      | Dogalgaz | 120    |