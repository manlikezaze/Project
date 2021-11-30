Feature: Add to wishlist feature.

  Background:
    Given the homepage is loaded.
    When the More button is clicked
    And the Add to wishlist button is clicked.

    Scenario:
      Then a "You must be logged in to manage your wishlist."message should be shown.

    Scenario:
      Given the user is signed in with "zaze19@icloud.com" and "19999".
      And the homepage is loaded.
      When the More button is clicked
      And the Add to wishlist button is clicked.
      Then a "Added to your wishlist."message should be shown.