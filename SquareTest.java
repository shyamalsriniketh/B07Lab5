package B07lab5;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;



public class SquareTest {
    @Test
    void testConstructorAndGetLength() {
        Square s = new Square(5.0);
        assertEquals(5.0, s.getLength());
    }

   @Test
   void testCalcAreaAfterConstructor() {
    Square s = new Square(3.0);
    assertEquals(9.0, s.calc_area());

   }
   @Test
   void testCalcAreaAfterSetLength() {
    Square s = new Square(3.0);
    s.set_length(4.0);
    assertEquals(16.0, s.calc_area());

   }

   @Test
   void testPerimeterAfterConstruction() {
    Square s = new Square(2.5);
    assertEquals(10.0, s.perimeter());
   }

   @Test
   void testPerimeterAfterSetLength() {
    Square s = new Square(2.5);
    s.set_length(6.0);
    assertEquals(24.0, s.perimeter());
   }

   @Test
   void testSetLengthAndGetLength() {
    Square s = new Square(1.0);
    s.set_length(7.0);
    assertEquals(7.0, s.get_length());
   }



}
