package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	
	public TestBase() {
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("D:\\Testing team\\Phani\\NewWorkspace\\restapi\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
		 
			e.printStackTrace();
		} catch (IOException e) {
	 
			e.printStackTrace();
		}
		
	}

	
 
}
