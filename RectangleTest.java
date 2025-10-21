package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testPerimeter() {
		Rectangle r1= new Rectangle(2,4);
		double test= r1.perimeter();
		assertEquals(test,12);
	}
	
	@Test
	void testArea() {
		Rectangle r1= new Rectangle(2,4);
		double test= r1.area();
		assertEquals(test,8);
	}

}
