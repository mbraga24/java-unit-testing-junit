package com.testme.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAndAfter.class, StringHelperTest.class })
public class AllTests {

}
