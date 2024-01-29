package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features ="classpath:features"
        ,glue = {"tests"}
        ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true
        ,publish = false

)
public class Runner extends AbstractTestNGCucumberTests {

}