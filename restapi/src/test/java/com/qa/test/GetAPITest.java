package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase{
	
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	@BeforeMethod()
	public void setup() {
		
		testBase = new TestBase();
		// serviceUrl = prop.getProperty("URL");
	//	 apiUrl = prop.getProperty("serviceURL");
		
	//	 url= serviceUrl+apiUrl;
	
	url=  "https://reqres.in/api/users";
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException {
		
		RestClient rc= new RestClient();
		rc.get(url);
		
	}
	

}
