package generic;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CommonLib {
    protected Response response;
    protected ValidatableResponse json;
    protected RequestSpecification request;
}
