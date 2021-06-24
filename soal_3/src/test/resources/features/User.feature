Feature: User Management
  As a User
  I want to create and get list user data
  So that I can manage user data

  Scenario: get list user data
    Given I am on user management page
    When I input list user data page
    And I click Send
    Then I can see list of user personal data on the specified page

  Scenario: post create user
    Given I am on user management page
    When I enter name and job correctly
    And I click Send
    Then I can see a new user personal data successfully created