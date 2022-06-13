Feature: ebay search

  Scenario Outline: ebay simple search
    Given I am on ebay homepage
    When I enter the search "<term>"
    Then I click on ebay search button
    And I receive related search result

    Examples: 
      | term         |
      | toyota camry |
