package com.sampleFramework.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		tags= "@test",
		features = "src/test/resources/features",
		glue = "com/sampleFramework/step_definitions",
		dryRun = false,
		plugin = {
				"json:target/cucumber.json",
				"pretty"
				
		}
		
		)


public class CukesRunner {

}
