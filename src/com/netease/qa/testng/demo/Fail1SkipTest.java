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
public class Fail1SkipTest {
	private static Logger logger;
	private int count = 0;
	
	public Fail1SkipTest() {
		logger = Logger.getLogger(this.getClass());
		logger.info("Fail1SkipTest()");
	}
	
	@BeforeMethod
	public void setUp() {
		logger.info("Fail1SkipTest setUp");
		count++;
		if(count == 2)
			Assert.fail("skip");
	}


	@Test(description = "testFail1Skip")
	public void testFail1Skip() {
		logger.info("count=" + count);
		Assert.fail();
	}

	
}
