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
public class Fail1SuccessTest {
	private static Logger logger = Logger.getLogger(Fail1SuccessTest.class);
	private int count = 0;
	
	@BeforeMethod
	public void setUp() {

	}


	@Test(description = "testFail1Sussces")
	public void testFail1Sussces() {
		logger.info("count=" + count);
		count++;
		if(count < 2) {
			Assert.fail("FailSussces2");
		}
	}
	
}
