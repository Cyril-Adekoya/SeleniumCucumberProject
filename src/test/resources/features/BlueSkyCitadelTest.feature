Feature: BlueSky Form Test
  Scenario: Form Test
    Given I navigate to blueskycitadelform site
   # When I enter first name
    #And I enter Lastname
    #And I send age 18-30
    #And I click on Submit
    #Then the form is submitted

 @CyrilProfileTest
  Scenario:Profile Update Test
    Given I have registered on blueskycitadel
    When I enter my username and Password
    And I click on Submit link
    Then My form is accepted