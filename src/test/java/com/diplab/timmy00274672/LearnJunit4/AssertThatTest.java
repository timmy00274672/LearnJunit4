package com.diplab.timmy00274672.LearnJunit4;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AssertThatTest {
    private int id = 6;
    private boolean trueValue = true;
    private Object nullObject = null;
    // private String msg = "Hello World!";
    /*
     * Above gets the error information: java.lang.AssertionError: Expected: (a
     * string starting with "Helloo" and a string ending with "World") but: a
     * string starting with "Helloo" was "Hello World!"
     */
    private String msg = "Hello World";

    @Test
    public void testAssertThat() throws Exception {
	// 由于静态导入了org.haibin369.matcher.MyMatchers.*，可以调用里面的
	// is(), nullValue(), containsString(), startsWith()方法，可读性更好
	assertThat(id, is(6));
	assertThat(trueValue, is(true));
	assertThat(nullObject, nullValue());
	assertThat(msg, both(startsWith("Hello")).and(endsWith("World")));
    }
}