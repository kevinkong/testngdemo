package com.netease.qa.testng.demo;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * test
 * @author kevinkong
 *
 */
public class Fail3Test {
	private static Logger logger;
	private int count = 0;
	
	public Fail3Test() {
		logger = Logger.getLogger(Fail3Test.class);
	}
	
	@BeforeMethod
	public void setUp() {
		logger.info("Fail3Test setUp");
	}


	@Test(description = "testFail3")
	public void testFail3() {
		logger.info("count=" + count);
		count++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(count < 100) {
			Assert.fail("testFail3");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		logger.info("tearDown");
		if(count > 3) {
			Assert.fail();
		}

	}
	
}
