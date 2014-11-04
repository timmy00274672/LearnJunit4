package com.diplab.timmy00274672.LearnJunit4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private static final double DELTA = 0.01;

    private int dividend;
    private int divisor;
    private int result;

    public CalculatorTest(int dividend, int divisor, int result) {
	this.dividend = dividend;
	this.divisor = divisor;
	this.result = result;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParameters() {
	return Arrays.asList(new Object[][] {
		{ 9, 3, 3 }, { 15, 0, 0 }, { 5, 1, 5 }, { 12, 4, 3 } });
    }

    @Test
    public void test() {
	Assume.assumeTrue("Divisor can't be 0", divisor != 0);
	assertEquals(result, Calculator.divide(dividend, divisor), DELTA);
    }
}