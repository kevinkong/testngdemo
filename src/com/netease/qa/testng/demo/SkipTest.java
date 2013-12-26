package com.netease.qa.testng.demo;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * test
 * @author kevinkong
 *
 */
public class SkipTest {
	private static Logger logger = Logger.getLogger(SkipTest.class);
	private int count = 0;
	
	@BeforeMethod
	public void setUp() {
		logger.info("SkipTestsetUp");
		Assert.fail("skip");
	}

	@Test(description = "TestSkip")
	public void testSkip() {
		logger.info("count=" + count);
	}
	
}
