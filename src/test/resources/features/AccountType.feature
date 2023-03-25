Feature: Account Type

  Scenario: Teacher user
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacher"

  Scenario: Student user
    Given The user is on the login page
    When The user logs in using "SDETB1@bootflow.academy" and "SDETB1!"
    Then The welcome message contains "Student"

  Scenario: Developer user
    Given The user is on the login page
    When The user logs in using "bootdev@bootflow.academy" and "Dev123"
    Then The welcome message contains "Developer"

  Scenario: Developer user
    Given The user is on the login page
    When The user logs in using "ortakoyadnan@gmail.com" and "183079ao"
    Then The welcome message contains "adnan ortakoy"

  Scenario Outline: Different User Type
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"

    Examples:

    |userType|password|name|
    |teacher@bootflow.academy|Test12345!|Teacher|
    |SDETB1@bootflow.academy|SDETB1!|Student|
    |bootdev@bootflow.academy|Dev123|Developer|
    |ortakoyadnan@gmail.com|183079ao|adnan ortakoy|