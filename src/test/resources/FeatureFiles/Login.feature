Feature: Login Functionality

  As a registered user,
  I want to be able to sign in successfully after providing valid credentials

  Background:
    Given user has launched the application
@login
    Scenario Outline: Login with valid credentials
      When user clicks on My Account button
      And selects login button
      And enters <email address> into email address field in login page
      And enters correct <password> into password field
      And clicks on login button
      Then user should be signed in and navigated to account page
      Examples:
        |email address           |password |
        |"nazanwa007@gmail.com"   |12345    |
        |"nazanwa0000@gmail.com "  |12345    |
        |"nazanwa008@gmail.com "   |12345   |


