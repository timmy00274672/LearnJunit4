package com.diplab.timmy00274672.LearnJunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifierTest {

    String result;

    @Rule
    public Verifier verifier = new Verifier() {
	@Override
	protected void verify() throws Throwable {
	    if (!"Success".equals(result)) {
//		throw new Exception("Test Fail.");
	    }
	}
    };

    @Test
    public void testVerifier() {
	result = "Fail";
    }
}
