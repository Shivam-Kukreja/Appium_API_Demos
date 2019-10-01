package Object_Repository;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;

import Utils.Base.Driver;
import Utils.DataSource.XML;
import io.appium.java_client.MobileElement;

public class Elements extends Driver {
	
	public MobileElement getAnimation_tab() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button","get_animation")));
	}
	
	public MobileElement getHideShow() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button","hide_show")));
	}
	
	public MobileElement HideShow_Tab() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button", "btn_hide")));
	}
	
	public MobileElement hide0() throws DocumentException {
		try {
			return driver.findElement(By.xpath(XML.Reader("button","hide_0")));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public MobileElement hide1() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button","hide_1")));
	}
	
	public MobileElement hide2() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button","hide_2")));
	}
	
	public MobileElement hide3() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button","hide_3")));
	}
	
	public MobileElement show_btn() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button", "show")));
	}
	
	public MobileElement getApp_tab() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button", "get_app")));
	}
	
	public MobileElement actn_bar() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button", "action_bar")));
	}
	
	public MobileElement dsp_optn() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button", "display_options")));
	}
	
	public MobileElement show_TtlBtn() throws DocumentException {
		return driver.findElement(By.xpath(XML.Reader("button", "show_title")));
	}
	
	public boolean get_title() throws DocumentException {
		try {
			driver.findElement(By.xpath(XML.Reader("button", "Text_view")));
			return true;
			}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
			}
		 
	}
}
