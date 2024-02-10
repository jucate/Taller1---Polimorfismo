package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;
public class TriangleTest {
    @Test
    void testCreate(){
        Triangle triangle= new Triangle(2.0,2.0);
        assertEquals(2.0,triangle.getX1());
        assertEquals(2.0,triangle.getY1());
    }
    @Test
    void testCalculate(){
        Triangle triangle= new Triangle(2.0,2.0);
        assertEquals((triangle.getX1()*triangle.getY1())/2,triangle.calculateArea());
        assertEquals(triangle.getX1() + 2 * sqrt((triangle.getY1() * triangle.getY1() - 4 * triangle.calculateArea()) / triangle.getX1()),triangle.calculatePerimeter());

    }
}
