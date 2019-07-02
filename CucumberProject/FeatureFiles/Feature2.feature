Feature: As a User i want to test login feature with multiple datasets.


  Scenario Outline: To test login with invalid credentials
    Given Application is up and running
    When I enter <username> and <password> on Login page
    Then Error message should be displayed

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury2 | mercury2 |
