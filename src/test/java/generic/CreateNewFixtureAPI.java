package generic;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.DecoderConfig;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.internal.http.ContentEncoding;

import java.nio.charset.StandardCharsets;

import static io.restassured.config.RestAssuredConfig.config;

public class CreateNewFixtureAPI {
    public String createNewFixtureAPIURL = "http://localhost:3000/fixture";
    private CommonLib commonLib;
    public CreateNewFixtureAPI(CommonLib commonLibObj)
    {
        commonLib=commonLibObj;
    }
    public String createNewFixture(String requestPayload)
    {
        commonLib.request = new RequestSpecBuilder().setBaseUri(createNewFixtureAPIURL).setContentType("charset=UTF-8").build();
        return RestAssured.given(commonLib.request).config(RestAssuredConfig.config().decoderConfig(DecoderConfig.decoderConfig().contentDecoders(DecoderConfig.ContentDecoder.GZIP, DecoderConfig.ContentDecoder.DEFLATE))).
            contentType(ContentType.JSON).body(requestPayload).post().getBody().asString();
    }
}
