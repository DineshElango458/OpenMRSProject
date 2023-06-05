@Patient
Feature: Verifying Dashboard page and Register a Patient menu

  Background: 
    Given User is on the Login page
    When User should enter valid Username and Password
    And User should pick any location

  Scenario Outline: Providing details in patent menu
    Then User should click Login button and verify success msg
    And User is on the Dashboard page and click Register the  patient menu
    When User should enter valid details of Demographics ,gender,birthdate,addressfield and phone number "<Name>","<Family Name>","<Gender>","<Day>","<Month>","<Year>","<Address>","<Address 2>","<City/Village>","<State/Province>","<Country>","<Postal Code>" and "<Phone number>"
    And User should click relationships details
    And User should verify confirm page all details
    Then User should click confirm and verify patient details page redirected

    Examples: 
      | Name | Family Name | Gender | Day | Month | Year | Address    | Address 2  | City/Village | State/Province | Country | Postal Code | Phone number |
      | Lara | k           | Male   |  27 | April | 2001 | 202 street | 204 street | Chennai      | Tamilnadu      | India   | 674966d     |   8765432170 |
