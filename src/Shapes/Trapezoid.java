package Shapes;

import java.awt.Color;

public class Trapezoid extends AbstractShape {
    private double baseA;
    private double baseB;
    private double height;

    public Trapezoid(double s1, double s2, double h, Color c) {
        super(c);
        baseA = s1;
        baseB = s2;
        height = h;
        checkInput();
    }

    /**
     * Calculate and returns area of a trapezoid.
     * @return area of a trapezoid.
     */
    @Override
    public double getArea() {
        return ((baseA * baseB) / 2) * height;
    }

    @Override
    public String toString () {
        return super.toString() + "Length of bases: " + getBaseA() + " and " + getBaseB() + " units. "
                                + "Height: " + getHeight() + " units.";
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getHeight() {
        return height;
    }

    /**
    * Performs validation to avoid zero or negative values and possibility to create a trapezoid.
    */
    private void checkInput() {
        checkOverflow();
        if (baseA <= 0 || baseB <= 0 || height <= 0) {
            throw new IllegalArgumentException("Value of the sides and height couldn't be negative or zero. The trapezoid cannot be built.");
        }
    }

    /**
     * Performs validation to avoid overflow of double data type.
     */
    private void checkOverflow() {
        double toCheck = ((baseA * baseB) / 2) * height;
        if (Double.isInfinite(toCheck)) {
            throw new ArithmeticException("Input values causes to double data type overflow in getArea() method.");
        }
    }
}
