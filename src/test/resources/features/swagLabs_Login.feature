
Feature: user should be able to log in with valid credentials

  Scenario Outline: Login positive test
    Given The user navigates to SwabLabs login page
    When The user enters "<username>" and "<password>" credentials
    Then  the user should be able to login swaglabs web site
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |