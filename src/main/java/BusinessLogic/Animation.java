package BusinessLogic;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Lib.CommonFunc.CommonUtil;
import Object_Repository.Elements;
import Utils.Base.Driver;
import util.screenshot.ScreenShotManager;

public class Animation extends Driver {
	Elements obj= new Elements();
	ExtentTest test;
	ScreenShotManager ss;
	
	public boolean Animation_HideTest() {
		test = report.startTest("hide btn");
		ss= new ScreenShotManager();
		try {
			CommonUtil.press(obj.getAnimation_tab());
			test.log(LogStatus.INFO, "Click on Animation");
			CommonUtil.press(obj.getHideShow());
			test.log(LogStatus.INFO, "Click on Hide/Show");
			CommonUtil.press(obj.HideShow_Tab());
			test.log(LogStatus.INFO, "Click on Hide");
			CommonUtil.press(obj.hide0());
			test.log(LogStatus.INFO, "Click on 0");
			if(!CommonUtil.isDisplayed(obj.hide0())) {
				test.log(LogStatus.PASS, "Hide button passed");
				report.endTest(test);
				return true;
			}
			else {
				test.log(LogStatus.FAIL, "Hide button failed",ss.CaptureScreenShot("Hide Functionality Failure", driver));
				report.endTest(test);

				return false;
			}
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			test.log(LogStatus.FAIL, "Some Exception",ss.CaptureScreenShot("exception", driver));
			report.endTest(test);
			return false;
		}
	}

	public boolean Animation_ShowTest() {
		test = report.startTest("show btn");
		try {
			CommonUtil.press(obj.show_btn());
			test.log(LogStatus.INFO, "Click on Show");
			if(CommonUtil.isDisplayed(obj.hide0()));
			test.log(LogStatus.PASS, "Show Worked");
			report.endTest(test);
			return true;
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			test.log(LogStatus.PASS, "Some Exception",ss.CaptureScreenShot("ExceptionErr", driver));
			report.endTest(test);
			return false;
		}
	}
}
