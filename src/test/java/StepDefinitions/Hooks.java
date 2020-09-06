package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.OutputType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverManager;
import utils.GlobalParams;
import utils.ServerManager;
import utils.VideoManager;


public class Hooks {
	   @Before
	    public void initialize() throws Exception {
	       new VideoManager().startRecording();
	    }

	    @After
	    public void quit(Scenario scenario) throws IOException {
	        if(scenario.isFailed()){
	            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png", scenario.getName());
	        }

      new VideoManager().stopRecording(scenario.getName());

	    }
}
