package util.screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.Base.Driver;
import io.appium.java_client.MobileDriver;

public class ScreenShotManager {
	public String CaptureScreenShot(String ScreenShotname,MobileDriver driver) {
		String path=null;
		String relativepath=null;
		try {
			path =Driver.testReportFolderPath+"Screenshots/"+ScreenShotname+".png";
			relativepath="./Screenshots"+ScreenShotname+".png";
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(path));
			return relativepath;
		}
		catch(Exception e) {
			System.out.println("Exception in screenshot"+e.getMessage());
		}
		return relativepath;
	}
}
