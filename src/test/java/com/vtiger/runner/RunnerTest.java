package com.vtiger.runner;




import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/vtiger/feature/Login.feature"
		,glue= {"com.vtiger.stepdefinition"},
		//format = {"pretty", "html:target/Destination"} ,
				plugin = { "pretty", "json:target/cucumber.json" },
				 //tags = {"@Smoke"},////or
				// tags = {"@Smoke,@sanity"},////or
				 //tags = {"@Smoke","@sanity"},////and
				 //tags = {"@Smoke","~@Sanity"},////And
				 //tags = {"~@Smoke","~@Sanity"},////And
				 monochrome = true)

//comment supriya
public class RunnerTest {

}
