package com.diplab.timmy00274672.LearnJunit4;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class UserTest {
    @DataPoint
    public static String GOOD_USERNAME = "optimus";
    @DataPoint
    public static String USERNAME_WITH_SLASH = "optimus/prime";

    @Theory
    public void filenameIncludesUsername(String username) {
	/*
	 * This makes it clear that the user's filename should be included in
	 * the config file name, only if it doesn't contain a slash. Another
	 * test or theory might define what happens when a username does contain
	 * a slash.
	 */
	assumeThat(username, not(containsString("/")));
	System.out.println(username);
	assertThat(username, containsString(GOOD_USERNAME));
    }
    
}