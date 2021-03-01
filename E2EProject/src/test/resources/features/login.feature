Feature: Login into Application
  Scenario Outline: Validating Login
    Given Initialize the browser with Chrome
    And Navigate to "http://qaclickacademy.com" Site
    And Possible popup is dealt with
    And Click on Login link in home page to land on secure sign in page
    When User enters <username> and <password> and logs in
    And User clicks forgot password
    And User Tries to Send Instructions <input>
    Then Validate the right page
    And Close the browser

    Examples:
    |username           |password |input        |
    |test99@gmail.com   |1234456  |xxx          |
    |hello@gmail.com    |654321   |hi           |
    |mymy@gmail.com     |321654   |hello        |
    |12oclock@gmail.com |password |it works! :) |
