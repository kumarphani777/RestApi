package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	
	public void get(String url) throws ClientProtocolException, IOException {
		 
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget);
		
		
		int statusCode= closeableHttpResponse.getStatusLine().getStatusCode();
		
		System.out.println("Status Code : "+statusCode);
		
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		
		JSONObject responseJSON = new JSONObject(responseString);
		
		System.out.println("Response of JSON : "+responseJSON);
		
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		
		HashMap<String,String> allHeaders = new HashMap<String,String>();
		
		for (Header header : headerArray) {
			
			allHeaders.put(header.getName(), header.getValue());
			
		}
		
		System.out.println(allHeaders);
		
		
	}
  
}
