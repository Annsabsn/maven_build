import org.junit.Test;
import static org.junit.Assert.*;

public class QETest {

    @Test
    public void testPositiveRoots() {
        double a = 1, b = -5, c = 6;
        double det = b * b - 4 * a * c;
        assertTrue(det > 0);
    }

    @Test
    public void testEqualRoots() {
        double a = 1, b = -2, c = 1;
        double det = b * b - 4 * a * c;
        assertEquals(0.0, det, 0.001);
    }

    @Test
    public void testComplexRoots() {
        double a = 1, b = 2, c = 5;
        double det = b * b - 4 * a * c;
        assertTrue(det < 0);
    }
}