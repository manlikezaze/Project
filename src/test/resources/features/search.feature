Feature: Search feature

  Background:
    Given the homepage is opened.

  Scenario Outline:
    Given the search field is filled with '<item>'
    When the Search icon is clicked
    Then confirm the '<msg>' help message is shown
    And the search result should be '<result>'
    Examples:
      | item        | msg                                             | result                    |
      |             | Please enter a search keyword                   |0 results have been found. |
      | nothing     | No results were found for your search "nothing" |0 results have been found. |
      | dress       |                                                 |7 results have been found. |
      | blouse      |                                                 |1 result has been found.   |
      | Summer      |                                                 |4 results have been found. |
      | t-shirts    |                                                 |1 result has been found.   |
      | short       |                                                 |4 result has been found.   |
      | printed     |                                                 |5 result has been found.   |