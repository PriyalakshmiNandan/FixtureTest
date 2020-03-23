
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin={"pretty","html:target/cucumber.html"},features = {"src/test/resources/features"},glue={"stepdefinitions"},strict=true,monochrome=true)
    public class TestRunner extends AbstractTestNGCucumberTests {

}
