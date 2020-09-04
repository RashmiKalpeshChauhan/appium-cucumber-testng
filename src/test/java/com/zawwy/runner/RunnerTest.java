package com.zawwy.runner;

//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.FeatureWrapper;
//import io.cucumber.testng.PickleWrapper;
////import io.cucumber.testng.TestNGCucumberRunner;
//
import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "StepDefinitions" }, plugin = { "pretty",
		"html:target/cucumber" },monochrome = true,strict=true,tags = { "@GuestUser" }
         )

public class RunnerTest {

//	private TestNGCucumberRunner testNGCucumberRunner;
//	
//    @Parameters({"platformName","platformVersion","deviceName"})
//	@BeforeClass(alwaysRun = true)
//	public void setUpClass(String platformName,String platformVersion,String deviceName  ) {
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	}
//
//	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
//	public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {
//		testNGCucumberRunner.runScenario(pickle.getPickle());
//	}
//
//	@DataProvider
//	public Object[][] scenarios() {
//		return testNGCucumberRunner.provideScenarios();
//	}
//
//	@AfterClass(alwaysRun = true)
//	public void tearDownClass() {
//		testNGCucumberRunner.finish();
//	}

}
