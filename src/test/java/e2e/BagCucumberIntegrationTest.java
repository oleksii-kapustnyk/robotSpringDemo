package e2e;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        plugin = {"pretty", "html:target/cucumber/bagbasics.html"},
        glue = {"e2e.steps",
                "e2e.config"})
public class BagCucumberIntegrationTest {
}
