Feature: Verify Whether User is able to Delete  desired Fixture

  Scenario Outline: Verify whether user is able to Delete Fixture by ID
    When User have requested the Delete end point for fixture Deletion for <ID>
    Then Verify whether user gets proper response for successful Fixture deletion
  Examples:
  |ID |
  | 1 |
  Scenario Outline: Verify whether user is able to Delete Fixture by ID
    When User have requested the Delete end point for fixture Deletion for <ID>
    Then Verify whether user gets proper error response for failure in Fixture deletion
    Examples:
      |ID   |
      | 100 |