package generic;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class DeleteFixtureAPI {
    public String deleteFixtureAPI = "http://localhost:3000/fixture/";
    private CommonLib commonLib;
    public DeleteFixtureAPI(CommonLib commonLibObj)
    {
        commonLib=commonLibObj;
    }
    public String deleteFixture(int id)
    {
        commonLib.request = new RequestSpecBuilder().setUrlEncodingEnabled(false).build(); //pathParam("id",""+id).delete("/{id}")
        return RestAssured.given(commonLib.request).delete(deleteFixtureAPI+id).getBody().asString();
    }
}
