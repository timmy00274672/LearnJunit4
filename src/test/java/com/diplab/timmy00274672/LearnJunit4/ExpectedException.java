package com.diplab.timmy00274672.LearnJunit4;

import java.util.ArrayList;

import org.junit.Test;


public class ExpectedException {
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void expectException(){
	new ArrayList<Object>().get(0);
    }
}
