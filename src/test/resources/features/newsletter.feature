Feature: Newsletter feature

  Background:
    Given the homepage is opened.
    And the newsletter arrow button is clicked.

    Scenario:
      Given a "" email address is entered.
      Then a "Newsletter : Invalid email address." message should be shown.

    Scenario:
      Given a "zaze19@icloud.com" email address is entered.
      Then a "Newsletter : You have successfully subscribed to this newsletter." message should be shown.