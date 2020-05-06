Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request <amount>
    Then $30 should be dispensed
        Examples:
      | amount |
      | 30$    |
      | 200$   |
      | 1$     |


  Scenario Outline: Unsuccessful withdrawal more cash than is in a wallet
    Given I have deposited $200 in my wallet
    When I request <amount>
    Then The teller informs me there is not enough money in my account
    Examples:
      | amount   |
      | 201$     |


  Scenario: Attempt to withdraw 0$ from a wallet
    Given I have deposited $200 in my wallet
    When I request 0$
    Then The teller informs me that even no coin has such value