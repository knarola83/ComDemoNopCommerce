Feature: Registration on demo.commerce.com
  As a user, I want register my account on the demo.commerce.com
  So I can use website account

  Background:
    Given user already on the home page

  Scenario: To verify I should able to register an account registration
    Given user already on registration page
    When I fill in all the information in the registration form
    And I click on the submit button
    Then I should see registration successful message

  Scenario Outline: To verify I should able to register multiple account
    Given user already on the registration page
    When I fill in the form information "<FirstName>" "<LastName>"
    And I click on the submit button
    Then I should be able to register with successful message
    Examples:
      | FirstName | LastName |
      | Vijay     | Patel    |
      |           |          |