package com.adidas.assertions;

import org.testng.Assert;

import com.adidas.utility.Log;

public class Validator {
	public static void verify(String actual, String expected) {
		Log.info("Actual value: " + actual + "\t Expected value: " + expected);
		Assert.assertEquals(actual, expected);
		Log.info("Verification successfully done.");
	}
}
