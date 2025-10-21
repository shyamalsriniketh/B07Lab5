package B07Lab5;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testConstructorAndGetters() {
        // Test normal case
        Rectangle rect = new Rectangle(5.0, 3.0);
        assertEquals(5.0, rect.height, 0.001);
        assertEquals(3.0, rect.width, 0.001);
        
        // Test height to be zero
        Rectangle heightZero = new Rectangle(0.0, 4.0);
        assertEquals(0.0, heightZero.height, 0.001);
        assertEquals(4.0, heightZero.width, 0.001);

		//Test width to be zero
		Rectangle widthZero = new Rectangle(4.0, 0.0);
        assertEquals(0.0, widthZero.height, 0.001);
        assertEquals(4.0, widthZero.width, 0.001);
        
        // Test with decimal values
        Rectangle rectDecimal = new Rectangle(2.5, 3.7);
        assertEquals(2.5, rectDecimal.height, 0.001);
        assertEquals(3.7, rectDecimal.width, 0.001);
    }

    @Test
    public void testPerimeter() {
        // Test normal case
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        assertEquals(16.0, rect1.perimeter(), 0.001);
        
        // Test with zero height
        Rectangle rect2 = new Rectangle(0.0, 3.0);
        assertEquals(6.0, rect2.perimeter(), 0.001);
        
        // Test with zero width
        Rectangle rect3 = new Rectangle(5.0, 0.0);
        assertEquals(10.0, rect3.perimeter(), 0.001);
        
        // Test with both zero
        Rectangle rect4 = new Rectangle(0.0, 0.0);
        assertEquals(0.0, rect4.perimeter(), 0.001);
        
        // Test with decimal values
        Rectangle rect5 = new Rectangle(2.5, 3.5);
        assertEquals(12.0, rect5.perimeter(), 0.001);
        
    }

    @Test
    public void testArea() {
        // Test normal case
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        assertEquals(15.0, rect1.area(), 0.001);
        
        // Test with zero height
        Rectangle rect2 = new Rectangle(0.0, 3.0);
        assertEquals(0.0, rect2.area(), 0.001);
        
        // Test with zero width
        Rectangle rect3 = new Rectangle(5.0, 0.0);
        assertEquals(0.0, rect3.area(), 0.001);
        
        // Test with both zero
        Rectangle rect4 = new Rectangle(0.0, 0.0);
        assertEquals(0.0, rect4.area(), 0.001);
        
        // Test with decimal values
        Rectangle rect5 = new Rectangle(2.5, 3.5);
        assertEquals(8.75, rect5.area(), 0.001);
        
        // Test with large values
        Rectangle rect6 = new Rectangle(100.0, 50.0);
        assertEquals(5000.0, rect6.area(), 0.001);
        
        // Test with very small values
        Rectangle rect7 = new Rectangle(0.1, 0.1);
        assertEquals(0.01, rect7.area(), 0.001);
    }

}
