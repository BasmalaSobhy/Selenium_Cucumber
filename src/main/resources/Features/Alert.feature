@regression
Feature: User uses Alert page

  """
  Feature >> a description for the feature under test
  Background >> like scenario that runs before each test case
  Scenario >> represents a test case
  Scenario Outline >> test case that has a list of dynamic data
  Examples >> The data used with the test Scenario
  Given >> prerequisites before the test steps
  When >> first test step
  Then >> what should happen after the test
  And >> can be used after Given, When and Then

  Flow of execution:
  1. @Before
  2. Background
  3. Scenario
  4. @After

  Note: single line comment starts with #
  multiple line comment """     """
  """
  Scenario: user uses jsConfirm
    Given user goes to alert page
    When user clicks on ConfirmJs button
    And user clicks on ok on the alert
    Then A result message will appear

  Scenario Outline: user uses jsPrompt
    Given user goes to alert page
    When user clicks on PromptJs button
    And user sends "<text>"
    And user clicks on ok on the alert
    Then A result message will appear

    Examples:
      | text |
      | Assert |
      | Alert  |