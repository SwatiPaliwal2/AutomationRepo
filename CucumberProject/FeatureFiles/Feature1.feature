Feature: As a user I want to login to the application

  Scenario: To test login scenario
    Given Application is up and running
    When I enter valid credentials
    Then I should be looged in successfully.
