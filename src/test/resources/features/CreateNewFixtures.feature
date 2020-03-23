Feature: Verify Whether User is able to create new Fixture

  Scenario Outline: Verify whether user is able to Create New Fixture
    When User have requested the Post end point for new fixture creation for "Creation"
    Then Verify whether user gets proper response for successful Fixture creation
    When User have requested the Get end point for retriving all fixtures
    Then Verify whether user gets list of Fixtures
  Examples:
  |ID   |
  |100  |
#  Scenario: Verify whether user is gets error response for invalid Create Request
#    Given User have valid Game Status but incorrect data format
#    When User have requested the Post end point for new fixture creation with Incorrect Data Format
#    Then Verify whether user gets proper error response for failure in Fixture creation