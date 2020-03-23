$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateNewFixtures.feature");
formatter.feature({
  "name": "Verify Whether User is able to create new Fixture",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify whether user is able to Create New Fixture",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have requested the Post end point for new fixture creation",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateNewFixtureStepsDefinitions.user_have_requested_the_Post_end_point_for_new_fixture_creation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user gets proper response for successful Fixture creation",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateNewFixtureStepsDefinitions.verify_whether_user_gets_proper_response_for_successful_Fixture_creation()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/DeleteFixture.feature");
formatter.feature({
  "name": "Verify Whether User is able to Delete  desired Fixture",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify whether user is able to Delete Fixture by ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Delete end point for fixture Deletion for \u003cID\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Verify whether user gets proper response for successful Fixture deletion",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify whether user is able to Delete Fixture by ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Delete end point for fixture Deletion for 1",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DeleteFixtureStepsDefinitions.user_have_requested_the_Delete_end_point_for_fixture_Deletion_for(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user gets proper response for successful Fixture deletion",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.DeleteFixtureStepsDefinitions.verify_whether_user_gets_proper_response_for_successful_Fixture_deletion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify whether user is able to Delete Fixture by ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Delete end point for fixture Deletion for \u003cID\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Verify whether user gets proper error response for failure in Fixture deletion",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID"
      ]
    },
    {
      "cells": [
        "100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify whether user is able to Delete Fixture by ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Delete end point for fixture Deletion for 100",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DeleteFixtureStepsDefinitions.user_have_requested_the_Delete_end_point_for_fixture_Deletion_for(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user gets proper error response for failure in Fixture deletion",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.DeleteFixtureStepsDefinitions.verify_whether_user_gets_proper_error_response_for_failure_in_Fixture_deletion()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/GetFixture.feature");
formatter.feature({
  "name": "Verify Whether User is able to Get all Fixtures",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify whether user is able to Get existing Fixture by ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Get end point for retriving fixture by \u003cID\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Verify whether user gets correct Fixture Details",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID"
      ]
    },
    {
      "cells": [
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify whether user is able to Get existing Fixture by ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Get end point for retriving fixture by 2",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.GetFixtureStepDefinitions.user_have_requested_the_Get_end_point_for_retriving_fixture_by(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user gets correct Fixture Details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GetFixtureStepDefinitions.verify_whether_user_gets_correct_Fixture_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify whether user is getting proper error response for the invalid Fixture ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Get end point for retriving fixture by \u003cID\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Verify whether user gets correct error response",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID"
      ]
    },
    {
      "cells": [
        "100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify whether user is getting proper error response for the invalid Fixture ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User have requested the Get end point for retriving fixture by 100",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.GetFixtureStepDefinitions.user_have_requested_the_Get_end_point_for_retriving_fixture_by(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user gets correct error response",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GetFixtureStepDefinitions.verify_whether_user_gets_correct_error_response()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify whether user is able to Get list of all existing Fixtures",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have requested the Get end point for retriving all fixtures",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.GetFixtureStepDefinitions.user_have_requested_the_Get_end_point_for_retriving_all_fixtures()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user gets correct list of Fixtures",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GetFixtureStepDefinitions.verify_whether_user_gets_correct_list_of_Fixtures()"
});
formatter.result({
  "status": "passed"
});
});