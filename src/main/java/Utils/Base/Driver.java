package Utils.Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;

import Utils.DataSource.XML;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import util.report.ExtentReportManager;

public class Driver {

	public static AppiumDriverLocalService service;
    
	public static AppiumDriver<MobileElement> driver;
	
	public static ExtentReports report=ExtentReportManager.getInstance();
	public static String snapshotFolderPath;
	public static String testReportFolderPath;
	public static String timeStamp;
	
	XML obj;
	
    public void invoke() throws DocumentException, MalformedURLException {
    	 DesiredCapabilities capabilties = new DesiredCapabilities();
    	  obj= new XML();  
    	    service=AppiumDriverLocalService.buildDefaultService();
    	    service.start();
    	    
    	    capabilties.setCapability(MobileCapabilityType.DEVICE_NAME,XML.Reader("Capabilities","dvc_name"));
            capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME,XML.Reader("Capabilities","ptf_name"));
            capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION,XML.Reader("Capabilities","ptf_vsn"));
            capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,XML.Reader("Capabilities","app_actvty"));
            capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,XML.Reader("Capabilities","app_pckg"));
    	    
            URL serverURL = new URL("http://localhost:"+4723+"/wd/hub");
            driver = new AndroidDriver<MobileElement>(serverURL,capabilties);
            driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
            
    }
   public void CloseDriver() {
	   driver.quit();
	   service.stop();
   }
}
