package generic;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class GetFixtureAPI {
    public String getIndividualFixtureAPI = "http://localhost:3000/fixture/";
    public String getListFixtureAPI = "http://localhost:3000/fixtures";
    private CommonLib commonLib;
    public GetFixtureAPI(CommonLib commonLibObj)
    {
        commonLib=commonLibObj;
    }
    public String getFixture(int id)
    {
        commonLib.request = new RequestSpecBuilder().setUrlEncodingEnabled(false).build(); //pathParam("id",""+id).delete("/{id}")
        return RestAssured.given(commonLib.request).get(getIndividualFixtureAPI+id).getBody().asString();
    }
    public String getListOfFixtures()
    {
        commonLib.request = new RequestSpecBuilder().setUrlEncodingEnabled(false).build(); //pathParam("id",""+id).delete("/{id}")
        return RestAssured.given(commonLib.request).get(getListFixtureAPI).getBody().asString();
    }
}
