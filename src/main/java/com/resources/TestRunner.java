package com.resources;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {
		"com.stepDefinition" }, plugin = "html:src/main/resources", dryRun = false, monochrome = true, strict = true)

public class TestRunner {

}
