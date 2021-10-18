
Feature: Web Order app login
  As a user I should be able to log in to web order app

  Background:
    Given we are at web order login page

  Scenario: User login successfully
 #   Given we are at web order login page
    When we provide valid credential
    Then we should see all order page

    Scenario: User log fail
 #     Given we are at web order login page
      When we provide invalid credentials
      Then we should still be at login page
      And login error message should be present

  @bla
      Scenario: User login with specific credentials
        When user provides username "Tester" and password "test"
        Then we should see all order page

        @bla
      Scenario: User login with wrong credentials

        When user provides username "bla" and password "bla"
        Then we should still be at login page
        And login error message should be present
