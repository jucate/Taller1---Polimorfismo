package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCreate(){
        Circle circle = new Circle(2);
        assertEquals(2.0, circle.getRadius());
    }

    @Test

    void testCalculate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0*Math.PI*2.0, circle.calculatePerimeter());
        assertEquals(Math.PI*Math.pow(circle.getRadius(),2),circle.calculateArea());
    }

}