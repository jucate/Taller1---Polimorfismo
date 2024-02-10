package co.edu.unicauca.taller1;

public class Square extends Figure{

    public Square(double x1) {
        setX1(x1);
    }

    @Override
    public double calculateArea() {
        return getX1()*getX1();
    }

    @Override
    public double calculatePerimeter() {
        return (getX1()*4);
    }

}
