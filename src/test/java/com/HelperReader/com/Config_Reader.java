package com.HelperReader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties p;

	public Config_Reader() throws Throwable {

		// File---> Config.Properties Location
		File f = new File(
				"C:\\Users\\SelvaGanapathy\\eclipse-workspace\\ProjectAutomationPractise\\src\\test\\java\\com\\Helper\\com\\Config.properties");
		// FileInputStream --> Its read data from the file
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String uname = p.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		String pswd = p.getProperty("password");
		return pswd;
	}
}
