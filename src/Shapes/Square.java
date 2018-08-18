package Shapes;

import java.awt.Color;

public class Square extends AbstractShape {
    private double side;

    public Square(double s, Color c) {
        super(c);
        side = s;
        checkInput();
    }

    /**
     * Calculate and returns area of a square.
     * @return area of a square.
     */
    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return  super.toString() + "Side length: " + getSide() + " units.";
    }

    public double getSide() {
        return side;
    }

    /**
     * Performs validation to avoid zero or negative values.
     */
    private void checkInput() {
        if (side <= 0) {
            throw new IllegalArgumentException("Value of the side couldn't be negative or zero. The square cannot be built.");
        }
        checkOverflow();
    }

    /**
     * Performs validation to avoid overflow of double data type.
     */
    private void checkOverflow() {
        double toCheck = side * side;
            if (Double.isInfinite(toCheck)) {
            throw new ArithmeticException("Input value " + side +  " causes to double data type overflow in getArea() method.");
        }
    }
}
