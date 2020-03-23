package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import generic.CreateNewFixtureAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.*;

public class CreateNewFixtureStepsDefinitions {
 String createNewFixtureStatus;
 private CreateNewFixtureAPI createNewFixtureAPI;
 public CreateNewFixtureStepsDefinitions(CreateNewFixtureAPI createNewFixtureAPI)
 {
  this.createNewFixtureAPI=createNewFixtureAPI;
 }
@When("User have requested the Post end point for new fixture creation for {string}")
 public void user_have_requested_the_Post_end_point_for_new_fixture_creation(String scenarioType)
 {
  String requestPayload = "";
  BufferedReader reader=null;
  try {
   if(scenarioType.equalsIgnoreCase("Creation"))
   reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator+ "FixtureDetails.json"));
   //else if(scenarioType.equalsIgnoreCase("Deletion"))
   // reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator+ "FixtureDetailsDelete.json"));
   StringBuilder stringBuilder = new StringBuilder();
   char[] buffer = new char[10];
   while (reader.read(buffer) != -1) {
    stringBuilder.append(new String(buffer));
    buffer = new char[10];
   }
   reader.close();

   requestPayload = stringBuilder.toString();
  }
  catch(FileNotFoundException fe)
  {
   fe.printStackTrace();
  }
  catch(IOException ie)
  {
   ie.printStackTrace();
  }
  createNewFixtureStatus = createNewFixtureAPI.createNewFixture(requestPayload);
 }
 @Then("Verify whether user gets proper response for successful Fixture creation")
 public void verify_whether_user_gets_proper_response_for_successful_Fixture_creation()
 {
  Assert.assertTrue(createNewFixtureStatus.equals("Fixture has been added"));
 }

}
