package Lib.CommonFunc;

import io.appium.java_client.MobileElement;

public class CommonUtil {

	public static boolean press(MobileElement go) {
		if(go!=null){
			go.click();
			return true;
		}
		else {
			System.out.println("Null parameter found");
			return false;
		}
	}
		
		public static boolean isDisplayed(MobileElement element) {
			if(element != null) {
				boolean b = element.isDisplayed();
				if(b == true) {
					return true;
				}
				else 
					return false;
			}
			else
				return false;
		}
		
	
}

