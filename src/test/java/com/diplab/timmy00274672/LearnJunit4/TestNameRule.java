package com.diplab.timmy00274672.LearnJunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameRule {
    @Rule
    public TestName testName = new TestName();

    @Test
    public void testTestName() {
	// 打印出测试方法的名字testTestName
	System.out.println(testName.getMethodName());
    }
}
