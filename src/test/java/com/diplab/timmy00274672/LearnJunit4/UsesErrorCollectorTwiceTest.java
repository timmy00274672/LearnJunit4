package com.diplab.timmy00274672.LearnJunit4;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

@SuppressWarnings("unused")
public class UsesErrorCollectorTwiceTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
	// collector.addError(new Throwable("first thing went wrong"));
	// collector.addError(new Throwable("second thing went wrong"));
	// collector.checkThat(1, CoreMatchers.is(21));
	// collector.checkThat(getResult(), not(containsString("ERROR!")));
	// all lines will run, and then a combined failure logged at the end.
    }
}
