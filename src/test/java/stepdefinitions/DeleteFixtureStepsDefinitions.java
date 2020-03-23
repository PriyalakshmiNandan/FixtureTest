package stepdefinitions;

import generic.CreateNewFixtureAPI;
import generic.DeleteFixtureAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteFixtureStepsDefinitions {
    String deleteFixtureResponse;
    private DeleteFixtureAPI deleteFixtureAPI;
    public DeleteFixtureStepsDefinitions(DeleteFixtureAPI deleteFixtureAPI)
    {
        this.deleteFixtureAPI=deleteFixtureAPI;
    }
    @When("User have requested the Delete end point for fixture Deletion for {int}")
    public void user_have_requested_the_Delete_end_point_for_fixture_Deletion_for(Integer fixtureID)
    {
    deleteFixtureResponse = deleteFixtureAPI.deleteFixture(fixtureID);
    }
    @Then("Verify whether user gets proper response for successful Fixture deletion")
    public void verify_whether_user_gets_proper_response_for_successful_Fixture_deletion()
    {
        Assert.assertTrue(deleteFixtureResponse.trim().equals("Fixture has been deleted"));
    }
    @Then("Verify whether user gets proper error response for failure in Fixture deletion")
    public void verify_whether_user_gets_proper_error_response_for_failure_in_Fixture_deletion()
    {
        Assert.assertTrue(deleteFixtureResponse.trim().equals("Fixture not found"));
    }
}
