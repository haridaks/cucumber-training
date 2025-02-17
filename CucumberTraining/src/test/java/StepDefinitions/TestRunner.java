package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\haridaks\\eclipse-workspace\\CucumberTraining\\src\\test\\resources\\Features" , 
glue = {"StepDefinitions"} ,
plugin = {"pretty" , "html:target/HtmlReports" , 
  "json:target/JSONReports/report.json", 
		"junit:target/JUnitReports/report.xml"},

tags="@smoketest" )

public class TestRunner {

}
