Feature: Sign in feature

  Background:
    Given the homepage has opened
    When the Sign In page is opened

  Scenario Outline:
    Given an '<email>' address is filled
    And a '<password>' is filled
    When the Sign In button is clicked
    Then the '<msg>' should be shown
    Examples:
      | email                  | password | msg                       |
      | osaz                   | 1234     | Invalid email address.    |
      |                        | 123      | An email address required.|
      | eguagieosaze@gmail.com |          | Password is required.     |
      |                        |          | An email address required.|
      | eguagieosaze@gmail.com | 1        | Invalid password.         |