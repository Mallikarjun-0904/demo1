
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class equiTest {

    equi obj = new equi();

    @Test
    public void testEquilateral() {
        assertTrue(obj.checkTriangle(5, 5, 5));
    }

    @Test
    public void testIsosceles() {
        assertFalse(obj.checkTriangle(5, 5, 3));
    }

    @Test
    public void testScalene() {
        assertFalse(obj.checkTriangle(3, 4, 5));
    }

    @Test
    public void testInvalidTriangle() {
        assertFalse(obj.checkTriangle(1, 2, 5));
    }

    @Test
    public void testZeroSide() {
        assertFalse(obj.checkTriangle(0, 5, 5));
    }
}
