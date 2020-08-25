import cucumber.api.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {"stepDefinitions"},
       tags = {"@CyrilProfileTest"}
        )

public class TestRunner {

}
