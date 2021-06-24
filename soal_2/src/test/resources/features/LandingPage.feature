@soal2
Feature: Landing Page
  As a User
  I want to access Flip Landing Page
  So that I can access any feature from Flip.id

  Scenario Outline: User try to access menu on flip landing page
    Given User open url flip id
    Then "<buttonName>" button is displayed
    And User click "<buttonName>" button

    Examples:
    | buttonName  |
    | Bantuan     |
    | Karir       |
    | Biaya       |
    | Masuk       |
