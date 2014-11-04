package com.diplab.timmy00274672.LearnJunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeOutRule {
    
    @Rule
    public Timeout globalTimeout = new Timeout(3000);

    //It will fail if any of the rule is broken.
    @Test(timeout=2000)
    public void testTimeOut(){
	while(true){}
    }
    
    @Test
    public void testTimeOutOfGlobal(){
	while(true){}
    }
}
