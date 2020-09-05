package com.zawwy.runner;



import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
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
import utils.DriverManager;
import utils.GlobalParams;
import utils.ServerManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "StepDefinitions" }, plugin = { "pretty",
		"html:target/cucumber" },monochrome = true,strict=true,tags = { "@GuestUser" }
         )

public class RunnerTest {
	@BeforeClass
    public static void initialize() throws Exception {
		 GlobalParams params = new GlobalParams();
	        params.initializeGlobalParams();

	      ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
	                + params.getDeviceName());

	        new ServerManager().startServer();
	        new DriverManager().initializeDriver();
    }

    @AfterClass
    public static void quit(){
    	      DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }
//        DriverManager driverManager = new DriverManager();
//        if(driverManager.getDriver() != null){
//            driverManager.getDriver().quit();
//            driverManager.setDriver(null);
//        }
//        ServerManager serverManager = new ServerManager();
//        if(serverManager.getServer() != null){
//            serverManager.getServer().stop();
//        }
//    }
//	private TestNGCucumberRunner testNGCucumberRunner;
////	
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
