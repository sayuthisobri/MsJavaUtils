package cf.msms.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test
 */
public class AppTest extends TestCase {
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testNumber() {
        assertEquals(-123.123, NumberUtils.getNumber("-123,.123"));
    }
}
