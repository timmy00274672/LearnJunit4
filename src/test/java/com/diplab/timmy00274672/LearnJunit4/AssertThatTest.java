package com.diplab.timmy00274672.LearnJunit4;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
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

    @Test
    public void testUser() {
	// User user = new User("haibin369", "123456");
	/*
	 * Above get bellow information : java.lang.AssertionError: Expected:
	 * Administrator with 'admin' as username and password but: was
	 * <com.diplab.timmy00274672.LearnJunit4.User@e026aee>
	 */
	User user = new User("admin", "admin");
	assertThat(user, isAdmin());
    }
    
    public static Matcher<User> isAdmin(){
	return new BaseMatcher<User>() {

	    public boolean matches(Object item) {
		if (item == null) {
		    return false;
		}

		User user = (User) item;
		return "admin".equals(user.getUsername())
			&& "admin".equals(user.getPassword());
	    }

	    public void describeTo(Description description) {
		description
			.appendText("Administrator with 'admin' as username and password");
	    }
	};
    }
}

