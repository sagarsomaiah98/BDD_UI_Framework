@NinjaRegression @Login

Feature: Validate login functionality

@ValidLogin 
  Scenario: Verify login functionality is successfully
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When Enter the username "kevin123@gmail.com"
    And Enter the password "Kevin123"
    And I click on login button
    Then I validate the login successfully
    
@InvalidLogin 
  Scenario: Verify invalid credentials for login
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When Enter the username "user1@gmail.com"
    And Enter the password "123456"
    And I click on login button
    Then I see no match warninng message
    
 @ForgotPassword    
  Scenario: Verify forgot password
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    And I click forgot password
    Then I validate email field to reset password
    

