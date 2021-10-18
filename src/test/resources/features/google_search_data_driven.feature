@google
Feature: Google Search Data Driven

  As a user,
  I should be able to search by keyword
  and get my result for multiple set of data

  Scenario Outline: : User search by keyword
    Given user is at home page
    When user searches for keyword "<keyword>"
    Then the title should start with "<keyword>"
    Examples:
      | keyword  |
      | Cybertruck  |
      | selenium  |
      | sdet jobs  |
      | how to make 100k being SDET  |
