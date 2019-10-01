package Utils.DataSource;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;		

public class XML {

	public static String Reader(String header,String key) throws DocumentException {
		File inputFile = new File(System.getProperty("user.dir") +"\\Resources\\Element.xml");
	    SAXReader saxReader = new SAXReader();
	    Document document = saxReader.read(inputFile);
	    String value=document.selectSingleNode("//root/"+header+"/"+key).getText();
	    return value;
	}
	
   
}
