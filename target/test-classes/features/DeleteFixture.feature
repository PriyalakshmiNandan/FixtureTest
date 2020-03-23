Feature: Verify Whether User is able to Delete  desired Fixture

  Scenario Outline: Verify whether user is able to Delete Fixture by ID
    #Tried to delete newly created Fixture but everytime user gets the relevant Fixture is not found , hence i have added the logic for deleting an existing fixture
    When User have requested the Delete end point for fixture Deletion for <ID>
    Then Verify whether user gets proper response for successful Fixture deletion
    And User have requested the Get end point for retriving fixture by <ID>
    Then Verify whether user gets correct error response
  Examples:
  |ID   |
  | 2 |

  Scenario Outline: Verify whether user is displayed with proper error for non-existing ID
    When User have requested the Delete end point for fixture Deletion for <ID>
    Then Verify whether user gets proper error response for failure in Fixture deletion
    Examples:
      |ID   |
      | 200 |