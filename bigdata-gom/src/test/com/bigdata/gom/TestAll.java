package com.bigdata.gom;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {


    /**
     * 
     */
    public TestAll() {
    }

    /**
     * @param arg0
     */
    public TestAll(String arg0) {
        super(arg0);
    }

    /**
     * Returns a test that will run each of the implementation specific test
     * suites in turn.
     */
    public static Test suite()
    {

        final TestSuite suite = new TestSuite("GOM");

        /*
		 * FIXME Clean up the test suite. The tests need to be cleaned up before
		 * they can run in CI. They use System.out, unconditional logging, and
		 * fail to clear out the per-test variables (memory leak).
		 * 
		 * @see https://sourceforge.net/apps/trac/bigdata/ticket/560
		 */
//        suite.addTestSuite(com.bigdata.gom.TestGOM.class);
//
//        suite.addTestSuite(com.bigdata.gom.TestRemoteGOM.class);
//
//        suite.addTestSuite(com.bigdata.gom.TestOwlGOM.class);

        return suite;

    }

}
