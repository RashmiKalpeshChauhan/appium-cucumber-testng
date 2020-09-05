package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitiesManager {
	 TestUtils utils = new TestUtils();

	    public DesiredCapabilities getCaps() throws Exception {
	        GlobalParams params = new GlobalParams();
	        Properties props = new PropertyManager().getProps();
	        try{
	            utils.log().info("getting capabilities");
	            DesiredCapabilities caps = new DesiredCapabilities();
	            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
	            caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
	            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
	            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                caps.setCapability("systemPort", params.getSystemPort());
                caps.setCapability("chromeDriverPort", params.getChromeDriverPort());            
                URL res = getClass().getResource(props.getProperty("androidAppLocation"));
    			File file = Paths.get(res.toURI()).toFile();
    			String appUrl = file.getAbsolutePath();    			
                utils.log().info("appUrl is" + appUrl); 
                caps.setCapability("app", appUrl);
	            return caps;
	        } catch(Exception e){
	            e.printStackTrace();
	            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
	            throw e;
	        }
	    }
}
