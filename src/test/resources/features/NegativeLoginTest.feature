Feature: Nagative login test

  Scenario Outline: Negative test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The worning message contains "<message>"
    Examples:
      | userType                 | password   | message |
      | teacher                  | Test12345! | message |
      | teacher@                 | Test12345! | message |
      | teacher@bootflow         | Test12345! | message |
      | teacher@bootflow.academy | Test12345  | message |