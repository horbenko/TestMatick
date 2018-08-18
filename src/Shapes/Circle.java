package Shapes;

import java.awt.Color;

public class Circle extends AbstractShape {
    private double radius;

    public Circle (double r, Color c) {
        super(c);
        radius = r;
        checkInput();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return  super.toString() + "Radius: " + getRadius() + " units.";
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Performs validation to avoid zero or negative values.
     */
    private void checkInput() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Value of the side couldn't be negative or zero. The circle cannot be built.");
        }
        checkOverflow();
    }

    /**
     * Performs validation to avoid overflow of double data type.
     */
    private void checkOverflow() {
        double toCheck = Math.PI * radius * radius;
        if (Double.isInfinite(toCheck)) {
            throw new ArithmeticException("Input value " + radius +  " causes to double data type overflow in getArea() method.");
        }
    }
}
