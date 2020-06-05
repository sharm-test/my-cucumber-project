package cucumberTest;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.testng.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/features/Test.feature"
 ,glue={"gluecode"}
 ,plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
 ,monochrome=true
 )

//@Test(groups = "cucumber scenarios", description = "Runs Cucumber Scenarios", dataProvider = "features")
public class TestRunner //extends AbstractTestNGCucumberTests
{
}

