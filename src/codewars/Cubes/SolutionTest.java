package codewars.Cubes;

import codewars.Cubes.Cube;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSetToThree() {
        Cube c = new Cube();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }
}

