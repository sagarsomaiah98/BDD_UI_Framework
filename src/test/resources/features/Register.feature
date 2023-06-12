@NinjaRegression @Register

Feature: Register functionality

@RegisterSuccess
  Scenario Outline: Register with email id
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    And I click on MyAccount
    And I click Register
    And I enter new account details for mandatory fields <FName> <LName> <Telephone> <Password> <ConfirmPassword> 
    And I click Privacy Policy
    And I click on Continue
    Then I verify Account is created
    Examples:
    |FName|LName|Telephone|Password|ConfirmPassword|
    |"Kevin"|"Joy"|"04123456789"|"Kevin123"|"Kevin123"|
   
@WarningMandatoryFields
  Scenario Outline: Verify Warning message displayed for mandatory fields
    Given I launch browser 
    And I Navigate to the url "https://tutorialsninja.com/demo/index.php?route=account/login"
    And I click on MyAccount
    And I click Register
    And I click on Continue
    Then I verify Warning message for mandatory fields <WarningPrivacyPolicy> <WarningFName> <WarningLName> <WarningEmail>  <WarningTelephone> <WarningPassword> 
    Examples:
    |              WarningPrivacyPolicy               |               WarningFName                       |              WarningLName                      |                   WarningEmail                |              WarningTelephone                |                   WarningPassword          |
    |"Warning: You must agree to the Privacy Policy!" |"First Name must be between 1 and 32 characters!"|"Last Name must be between 1 and 32 characters!"|"E-Mail Address does not appear to be valid!"|"Telephone must be between 3 and 32 characters!"|"Password must be between 4 and 20 characters!"|
