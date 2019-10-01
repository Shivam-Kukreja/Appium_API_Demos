package TestCases;

import java.net.MalformedURLException;

import org.dom4j.DocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import BusinessLogic.Animation;
import BusinessLogic.Display;
import Utils.Base.Driver;

public class temp extends Driver {
	Animation obj= new Animation();
	Display obj1= new Display();
	@Test
	public void temp1() throws MalformedURLException, DocumentException {
		invoke();
		Assert.assertTrue(obj.Animation_HideTest());	
		Assert.assertTrue(obj.Animation_ShowTest());
		}
	@Test
	public void temp2() {
		Assert.assertTrue(obj1.Display_Options());
	}
	@AfterMethod
	public void repo() {
		if(report!=null) {
			report.flush();
		}
	}
	@AfterSuite
	public void close() {
		CloseDriver();
	}
}
