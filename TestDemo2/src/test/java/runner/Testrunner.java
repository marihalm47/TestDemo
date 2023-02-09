package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= "src/test/resources/features",
	glue="step_definitions",
//	tags= "@HomeSuite, @SinginSuite,@QueueSuite,@GraphSuite",
	dryRun=false,
	monochrome=true,
	plugin = { "pretty", "html:target/dsAlgoReport.html" }
)
public class Testrunner {

}
