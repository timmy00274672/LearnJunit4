package com.diplab.timmy00274672.LearnJunit4;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assume.assumeThat;
import static org.junit.Assert.*;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {
    // 允许的最大误差
    private static final double DELTA = 0.01;

    @DataPoint
    public static int ZERO = 0;

    @DataPoint
    public static int TWO = 2;

    @DataPoint
    public static int EIGHT = 8;

    /*
     * Above is equal to:
     * 
     * @DataPoints public 
     * static int[] getTestData() { return new int[]{0, 2, 8}; }
     * 
     */
    // 标志这个测试为Theory测试
    @Theory
    public void testDivide(int dividend, int divisor) {
	// 跳过除数为0的case
	assumeThat(divisor, not(0));
	// Calculator.divide(dividend, divisor)方法返回他们相除的结果
	assertEquals(dividend / divisor, Calculator.divide(dividend, divisor),
		DELTA);
	System.out.println("Passed with: dividend=" + dividend + ", divisor="
		+ divisor);
    }
}