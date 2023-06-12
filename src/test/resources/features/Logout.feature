@NinjaRegression @Logout

Feature: Logout functionality

@LogoutVerify
  Scenario: Verify logout functionality 
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When Enter the username "kevin123@gmail.com"
    And Enter the password "Kevin123"
    And I click on login button
    And I click on MyAccount
    And I click on LogOut
    Then I verify user is logged out
    

  
