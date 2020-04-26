package com.project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = {"src/test/java/com/project/features"},
		plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
		glue = {"com/project/Hooks","com/project/stepDefinitions"}
		
		)

		
		

public class TestRunner {

}
