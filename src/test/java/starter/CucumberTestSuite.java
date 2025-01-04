package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
        glue = "src/test/java/starter/stepdefinitions",
        features = "src/test/resources/features/login"
)
public class CucumberTestSuite {
}
