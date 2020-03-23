package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import generic.CommonLib;
import generic.CreateNewFixtureAPI;
import generic.GetFixtureAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class GetFixtureStepDefinitions {
    String getFixtureWebServiceResponse,fixtureId;
    private GetFixtureAPI getFixtureAPI;
    public GetFixtureStepDefinitions(GetFixtureAPI getFixtureAPI)
    {
        this.getFixtureAPI=getFixtureAPI;
    }

    @When("User have requested the Get end point for retriving fixture by {int}")
    public void user_have_requested_the_Get_end_point_for_retriving_fixture_by(Integer fixtureID)
    {
    getFixtureWebServiceResponse = getFixtureAPI.getFixture(fixtureID);
    fixtureId=""+fixtureID;
    }
    @Then("Verify whether user gets correct Fixture Details")
    public void verify_whether_user_gets_correct_Fixture_Details()
    {
        ObjectMapper obj = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode= obj.readTree(getFixtureWebServiceResponse);
        }
        catch(JsonMappingException jme)
        {

        }
        catch(JsonProcessingException jpe)
        {

        }
        Assert.assertTrue(jsonNode.get("fixtureId").asText().equals(fixtureId));
    }
    @Then("Verify whether user gets correct error response")
    public void verify_whether_user_gets_correct_error_response()
    {
        Assert.assertTrue(getFixtureWebServiceResponse.trim().equals("Fixture not found"));
    }
    @When("User have requested the Get end point for retriving all fixtures")
    public void user_have_requested_the_Get_end_point_for_retriving_all_fixtures()
    {
        getFixtureWebServiceResponse = getFixtureAPI.getListOfFixtures();
    }
    @Then("Verify whether user gets correct list of Fixtures")
    public void verify_whether_user_gets_correct_list_of_Fixtures()
    {
        ObjectMapper obj = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode= obj.readTree(getFixtureWebServiceResponse);
        }
        catch(JsonMappingException jme)
        {

        }
        catch(JsonProcessingException jpe)
        {

        }
        for(int i=0;i<jsonNode.size();i++) {
            Assert.assertTrue(Integer.parseInt(jsonNode.get(i).get("fixtureId").asText())>0);
        }
    }
}
