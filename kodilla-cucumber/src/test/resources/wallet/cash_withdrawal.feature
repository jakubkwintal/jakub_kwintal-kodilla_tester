Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request <amount>
    Then <amount> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | amount |balance|
      | $30    |$170   |
      | $200   |$0     |
      | $1     |$199   |


  Scenario: Attempt to withdraw 0$ from a wallet
    Given I have deposited $200 in my wallet
    When I request "0"$
    Then The teller informs me that even no coin has such value