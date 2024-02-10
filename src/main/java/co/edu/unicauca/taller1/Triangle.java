package co.edu.unicauca.taller1;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    public Triangle(double x1, double y1) {
        setX1(x1);
        setY1(y1);
    }

    @Override
    public double calculateArea() {
        return (getX1()*getY1())/2;
    }

    @Override
    public double calculatePerimeter() {
        return getX1() + 2 * sqrt((getY1() * getY1() - 4 * calculateArea()) / getX1());
    }

}
