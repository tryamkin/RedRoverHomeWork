package redRowerHW.hw10_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Upper u = new Upper();

    @Test
    public void testSomething() {
        assertEquals("HELLO", u.MakeUpperCase("hello"));
    }
}
