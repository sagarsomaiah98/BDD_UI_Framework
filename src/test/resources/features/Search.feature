@NinjaRegression @Search
Feature: Search functionality

@productsearch
  Scenario: Verify Search functionality 
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    And I search the product "imac"
    Then search result should be displayed
    

  
