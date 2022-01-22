package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyMethod {
	private static FileInputStream obj_FileInputStream;
	private static Properties obj_Properties;
	public  Properties propertyMethod() {
		try {
			 
			 obj_FileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties");
			System.out.println("im an indian");
		} catch (FileNotFoundException e) {
			 System.out.println(e);
		
		}
		
		
		
	  obj_Properties=new Properties();
		try {
			obj_Properties.load(obj_FileInputStream);
			System.out.println("im a fooll");
			System.out.println(obj_FileInputStream);
			
		} catch (IOException e) {
			 System.out.println(e);
		}
	
	
	return obj_Properties;
	}
	
	

	 

}
