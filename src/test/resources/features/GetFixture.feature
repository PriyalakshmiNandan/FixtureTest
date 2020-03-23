Feature: Verify Whether User is able to Get all Fixtures

  Scenario Outline: Verify whether user is able to Get existing Fixture by ID
    When User have requested the Get end point for retriving fixture by <ID>
    Then Verify whether user gets correct Fixture Details
    Examples:
    |ID|
    | 1|

  Scenario Outline: Verify whether user is getting proper error response for the invalid Fixture ID
    When User have requested the Get end point for retriving fixture by <ID>
    Then Verify whether user gets correct error response
    Examples:
      |ID  |
      | 200|

  Scenario: Verify whether user is able to Get list of all existing Fixtures
    When User have requested the Get end point for retriving all fixtures
    Then Verify whether user gets correct list of Fixtures