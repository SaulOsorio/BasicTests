package com.informex.app.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
	public static Properties getProperties() {
		Properties properties = new Properties();
	    InputStream inputStream = null;
	    
	    try {
	        inputStream = new FileInputStream("C:/HPEL/Informex-Pre-Onboarding/google-test/src/test/resources/testconfig.properties");
	        properties.load(inputStream);

	    } catch (IOException ex) {
	        ex.printStackTrace();
	    } finally {
	        if (inputStream != null) {
	            try {
	                inputStream.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    return properties;
	}
}
