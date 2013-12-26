package com.netease.qa.testng.demo;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * test
 * @author kevinkong
 *
 */
public class SuccessTest {
	private static Logger logger = Logger.getLogger(SuccessTest.class);
	
	@BeforeMethod
	public void setUp() {
		logger.info("testSuccess setUp");
	}

	@Test(description = "testSuccess")
	public void testSuccess() {
		logger.info("testSuccess");
	}
	
}
