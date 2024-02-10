package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SquareTest {
    @Test
    void testCreate(){
        Square square = new Square(2.0);
        assertEquals(2.0,square.getX1());
    }
    @Test
    void testCalculate(){
        Square square = new Square(2.0);
        assertEquals((square.getX1()*4),square.calculatePerimeter());
        assertEquals(square.getX1()*square.getX1(),square.calculateArea());
    }
}
