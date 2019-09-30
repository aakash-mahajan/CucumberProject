package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "features\\Demotags.feature",
			glue = {"stepDefinition"},
			//tags = {"RegressionTest"}
			//tags = {"@RegressionTest","@SomkeTest"}//AND
			//tags = {"@RegressionTest,@SomkeTest"}// OR
			//tags = {"@RegressionTest","~@SomkeTest"}// ignore the tag
			plugin = {"html:target/Cucumber-reports","json:target/Cucumber-reports/26OnBoard.json"}
		)

public class DemoTagsRunner {

}
