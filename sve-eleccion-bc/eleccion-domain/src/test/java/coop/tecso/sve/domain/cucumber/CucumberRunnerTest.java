package coop.tecso.sve.domain.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" }, features = {
		"src/test/resources/cucumber/features" }, glue = "coop.tecso.sve.domain.cucumber.steps")
public class CucumberRunnerTest {

}
