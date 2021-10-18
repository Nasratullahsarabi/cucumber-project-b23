
Feature: Google Search
  As a use,
  I should be able to search by keyword
  and get my result

  Background:
    Given user is at home page

  Scenario: User search by keyword

    When user searches for keyword "selenium"
    Then user should see result page
    And the title should start with "selenium"


  Scenario: User search by keyword java

    When user searches for keyword "java"
    And the title should start with "java"