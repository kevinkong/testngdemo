package com.netease.qa.testng.demo;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * test
 * @author kevinkong
 *
 */
public class Fail2SuccessTest {
	private static Logger logger = Logger.getLogger(Fail2SuccessTest.class);
	private int count = 0;
	
	@BeforeMethod
	public void setUp() {

	}


	@Test(description = "testFail2Sussces")
	public void testFail2Sussces() {
		logger.info("count=" + count);
		count++;
		if(count < 3) {
			Assert.fail("testFail2Sussces");
		}
	}

	
}
