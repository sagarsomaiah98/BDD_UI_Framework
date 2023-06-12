@NinjaRegression @Homepage 

Feature: Home Page functionality

@Carttohomepage
  Scenario: Verify home page navigation
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    And I search the product "imac"
    And I click on addtocart
    And I click on shoppingcart
    And I click on Continue Shopping
    Then I am navigated to homepage
    
 @Desktopstohomepage
  Scenario: Verify home page navigation
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    And I click on PC(O) under Desktop menu
    And I click on Continue in PC page
    Then I am navigated to homepage
    

  
