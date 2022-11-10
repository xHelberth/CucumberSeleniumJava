Feature: feature to test general functionality

  Scenario: Change country in settings for United States
  	Given open browser
    Given visit web site Western Union
    And expand burger menu
    When select settings page
    And open select countries
    And change country to United States
    And confirm your choice
    Then the correct country page was loaded.

