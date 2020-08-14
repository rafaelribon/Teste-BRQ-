package br.ce.rafaelribon.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features\\realizarCompra.feature",
		glue = "br.ce.rafaelribon.steps",
		plugin = {"pretty"},
		monochrome = true,
		dryRun = false,
		strict = false
		)
public class RunnerTest   {
	
	

}
