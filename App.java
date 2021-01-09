package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log=LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
		String message="Hello, World";
		Log.debug(message + "will be printed on debug");
		Log.info(message + "will be printed on info");
		Log.warn(message + "will be printed on warn");
		Log.error(message + "will be printed on error");
		Log.fatal(message + "will be printed on fatal");
		Log.info("Appending String : {}.",message);
		System.out.println(message);
    }
}
