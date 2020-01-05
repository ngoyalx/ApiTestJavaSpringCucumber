Feature: Get user comments

  Scenario: Verify email and name is not blank in the comments
    Given I am an authorized user
    When I hit the get comments api
    Then verify email id is not blank
    Then verify parameters as following:
      | Email     | Name      |
      | NOT_BLANK | NOT_BLANK |