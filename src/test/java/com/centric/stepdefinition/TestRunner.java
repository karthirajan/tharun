package com.centric.stepdefinition;

import java.io.File;


import java.io.File;

import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\A_Config_Setup.feature",
                 glue = "com.centric.stepdefinition",
                 plugin = {"html:target","json:target/reports.json"},
                 dryRun=false)

public class TestRunner {


	
}
