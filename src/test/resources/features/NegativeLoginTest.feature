Feature: Nagative login test

  @wip
  Scenario Outline: Negative test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The warning message contains "<message>"
    Examples:
      | userType                 | password   | message                                                                  |
      | teacher                  | Test12345! | Please include an '@' in the email address. 'teacher' is missing an '@'. |
      | teacher@                 | Test12345! | Please enter a part following '@'. 'teacher@' is incomplete.             |
      | teacher@bootflow         | Test12345! | Please include a valid email!                                            |
      | teacher@bootflow.academy | Test12345  | Invalid Credentials!                                                     |