Feature: google search

  Scenario Outline: google simple search
    Given I am on  google homepage
    When I enter search "<term>"
    Then I click search button
    And I receive search result

    Examples: 
      | term         |
      | toyota corola |
