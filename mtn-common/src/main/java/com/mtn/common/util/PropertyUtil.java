package com.mtn.common.util;

import java.io.InputStream;
import java.util.Properties;
/**
 * @author Prabhakar Manthena
 *
 */
public class PropertyUtil {

	private static PropertyUtil propertyUtil;
	
	private Properties properties;
	
	private PropertyUtil() {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(MtnConstants.PROPERTY_FILE);
        try {
        	properties = new Properties();
        	properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public synchronized static PropertyUtil getInstance() {
		
		if(propertyUtil == null)	
		propertyUtil=new PropertyUtil();
		
		return propertyUtil;
	}

	/**
	 * @return the properties
	 */
	
	public Properties getProperties() {
		return properties;
	}
}
