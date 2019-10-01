package BusinessLogic;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Lib.CommonFunc.CommonUtil;
import Object_Repository.Elements;
import Utils.Base.Driver;
import util.screenshot.ScreenShotManager;

public class Display extends Driver {
	Elements obj= new Elements();
	ExtentTest test;
	ScreenShotManager ss;

	
	public boolean Display_Options() {
		test = report.startTest("verifyTitleBtn");
		ss= new ScreenShotManager();
		try {
			driver.navigate().back();
			test.log(LogStatus.INFO, "Click on back");
			driver.navigate().back();
			test.log(LogStatus.INFO, "Click on Back");
			CommonUtil.press(obj.getApp_tab());
			test.log(LogStatus.INFO, "Click on App Tab");
			CommonUtil.press(obj.actn_bar());
			test.log(LogStatus.INFO, "Click on Action Bar");
			CommonUtil.press(obj.dsp_optn());
			test.log(LogStatus.INFO, "Click on display");
			CommonUtil.press(obj.show_TtlBtn());
			test.log(LogStatus.INFO, "Click on ShowTTL");
			if(!obj.get_title()) {
				CommonUtil.press(obj.show_TtlBtn());
				test.log(LogStatus.INFO, "Click on ShowTTl");
				if(obj.get_title()) {
					test.log(LogStatus.PASS,"Title Found");
					report.endTest(test);
					return true;
				}
				else {
					test.log(LogStatus.FAIL, "Title not found",ss.CaptureScreenShot("TitleError", driver));
					report.endTest(test);
					return false;
				}
			}
			else {
				test.log(LogStatus.FAIL, "Element not found",ss.CaptureScreenShot("ElementError", driver));
				report.endTest(test);
			return false;
			}
		}
		catch(Exception e) {;
			test.log(LogStatus.FAIL,"Some Exception",ss.CaptureScreenShot("ExceptionError", driver));
			report.endTest(test);
			System.out.println(e.getMessage());
			return false;
		}
	}

}
