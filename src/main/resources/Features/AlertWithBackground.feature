@smoke
Feature: User uses Alert page (Background)

  Background: go to alert page
    Given user goes to alert page

  Scenario: user uses jsConfirm
    When user clicks on ConfirmJs button
    And user clicks on ok on the alert
    Then A result message will appear

  Scenario Outline: user uses jsPrompt
    When user clicks on PromptJs button
    And user sends "<text>"
    And user clicks on ok on the alert
    Then A result message will appear

    Examples:
      | text |
      | Assert |
      | Alert  |

