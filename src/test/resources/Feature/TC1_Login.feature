@Smoke
Feature: Verifying OpenMrs login page

  Background: 
    Given User is on the Login page
    When User should enter valid Username and Password

  Scenario: Verifying login page with valid credentials
    And User should pick any location
    Then User should click Login button and verify success msg
    And User is on the Dashboard page and click Register the  patient menu
