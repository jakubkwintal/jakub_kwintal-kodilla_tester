Feature: Is it divisible by 3 or 5?

  Scenario Outline: Number is divisible by 3 or 5 or 3&5 or none.
    Given Let's check <number>
    When I ask number is divisible
    Then I should hear <answer>
    Examples:
      | number                  | answer     |
      | three                   | "Fizz"     |
      | five                    | "Buzz"     |
      | fifteen                 | "FizzBuzz" |
      | twenty                  | "Buzz"     |
      | twenty one              | "Fizz"     |
      | sixteen                 | "None"     |
      | seventy three           | "None"     |
      | two hundred fifty five | "FizzBuzz" |