package com.appjangle.qunit.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.appjangle.qunit.QUnit;

public class TestQUnitEmbedding {

	@Test
	public void test_simple_tests() {
		try {
		QUnit
				.run(this, "qunit_example.html");
		
		Assert.fail("Test test should have failed since it contained an error.");
		
		} catch (Throwable t) {
			
			Assert.assertTrue(t.getMessage().contains("Assertion:"));
			
		}
	}

}
