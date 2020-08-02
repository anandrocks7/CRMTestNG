package com.crm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
Properties pro;
	
	public ReadConfig()
	{
		
		// "./"  represents the root directory of the project
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);// create object of fileimput stream
			pro = new Properties(); // create object of properties stream
			pro.load(fis);            //  Load the file
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseurl");//  use getproperty method to get key value pairs
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	/*public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}*/
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

}
