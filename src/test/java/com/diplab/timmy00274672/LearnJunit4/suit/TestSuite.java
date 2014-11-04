package com.diplab.timmy00274672.LearnJunit4.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.diplab.timmy00274672.LearnJunit4.AppTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
  AppTest.class, CopyOfAppTest.class
})
public class TestSuite {
  // the class remains empty,
  // used only as a holder for the above annotations
}
