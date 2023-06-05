@Regression
Feature: Verify attachment section and Delete Patient with reason

  Background: 
    Given User is on the Login page
    When User should enter valid Username and Password
    And User should pick any location
    Then User should click Login button and verify success msg
    And User is on the Dashboard page and click Register the  patient menu

  Scenario Outline: Verify attachment and Recent Visit and Delete Patient
    When User should enter valid details of Demographics ,gender,birthdate,addressfield and phone number "<Name>","<Family Name>","<Gender>","<Day>","<Month>","<Year>","<Address>","<Address 2>","<City/Village>","<State/Province>","<Country>","<Postal Code>" and "<Phone number>"
    And User should click relationships details
    And User should verify confirm page all details
    Then User should click confirm and verify patient details page redirected
    When User should click Start Visit and Confirm Visit
    And User should click Attachments menu
    And User should  add attachment file
    And User should enter msg in captions field "<Caption>" and Upload it
    Then User should verify toaster message "The attachment was successfully uploaded."and redirect to Patient page
    When User should verify Recent click entry and attachment section has an attachment
    And User should click End Visit and click Yes
    Then User should click Delete Patient "<Reason>" and confirm button
    And User should enter Delete Patient id and click search
    Then User should verify Delete Patient should not be displayed

    Examples: 
      | Name  | Family Name | Gender | Day | Month | Year | Address    | Address 2  | City/Village | State/Province | Country | Postal Code | Phone number | Caption       | Reason  |
      | Rahul | y           | Male   |  27 | April | 1998 | 205 street | 206 street | Aus          | Sysdney        | India   | 674966d     |   8765432170 | File Uploaded | Testing |
