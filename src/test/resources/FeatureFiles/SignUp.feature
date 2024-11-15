Feature: Sign up

As a first time user ogf the application,
  I want to be able to sign up successfully after providing all mandatory details


  Background:
    Given user has launched the application

  Scenario: Sign Up with valid credentials
    When user clicks on My Account button
    And selects Register
    And enters first name into first name field
    And enters last name into last name field
    And enters email address into email address field
    And enters telephone into telephone field
    And enters Password into Password field
    And enters Password into Password confirm field
    And selects Yes in Newsletter field
    And checks Privacy policy checkbox
    And clicks on Continue button
    Then success message should be displayed
    And user should be signed in automatically


