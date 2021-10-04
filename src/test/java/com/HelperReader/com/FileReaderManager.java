package com.HelperReader.com;


public class FileReaderManager {
	
	private FileReaderManager() {
	}
	
	// File Reader Manager
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	// Config_Reader Object
	public Config_Reader getInstanceCR() throws Throwable {
		Config_Reader cr = new Config_Reader();
		return cr;
	}

}
