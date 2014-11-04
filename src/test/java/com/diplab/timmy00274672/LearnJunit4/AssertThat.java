package com.diplab.timmy00274672.LearnJunit4;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AssertThat {
    @Test
    public void test() {
	// assertThat(0, is(1)); // fails:
	// failure message:
	// expected: is <1>
	// got value: <0>
	assertThat(0, is(not(1))); // passes
    }

    @Test
    public void test2() {
	String responseString = "color";
	assertThat(responseString,
		anyOf(containsString("color"), containsString("colour")));
    }
}
