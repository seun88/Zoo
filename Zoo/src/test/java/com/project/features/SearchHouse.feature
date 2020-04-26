Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given I navigate to zoopla site
    And input "<Location>"
    And input "<MinPrice>"
    
    Examples:
    |Location  |MinPrice|
    |Manchester|£180000|
    
    