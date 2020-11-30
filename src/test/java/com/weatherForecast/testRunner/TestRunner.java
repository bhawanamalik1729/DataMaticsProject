package com.weatherForecast.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\hitgarg\\eclipse-workspace\\weatherForecast\\Features",
		glue = "com.weatherForecast.testCases",
		plugin ={"pretty","html:html-output","json:json_report/cucumber.json","junit:junit_report/cucumber.xml"},
		dryRun = false,
		monochrome=true,
		strict = true
		
		)

public class TestRunner {

}
