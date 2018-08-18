package Shapes;

import java.awt.Color;
import java.util.Arrays;

public class Triangle extends AbstractShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle (double s1, double s2, double s3, Color c) {
        super(c);
        sideA = s1;
        sideB = s2;
        sideC = s3;
        checkInput();
    }

    /**
     * Calculate and returns area of a triangle using Heron's formula.
     * @return area of a triangle.
     */
    @Override
    public double getArea() {
        double sp;
        double area;
        sp = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(sp*(sp - sideA)*(sp - sideB)*(sp - sideC));
        return area;
    }

    @Override
    public String toString() {
        if (isEquilateral()) {
            return super.toString() + "Sides length: " + Arrays.toString(getAllSides()) + " units. Triangle is equilateral." ;
        }
        return super.toString() + "Sides length: " + Arrays.toString(getAllSides()) + " units.";
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double[] getAllSides() {
        return new double[]{sideA, sideB, sideC};
    }

    /**
     * Checks if a triangle is equilateral (triangle in which all three sides are equal).
     * @return true when triangle is equilateral, otherwise - false.
     */
    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    /**
     * Performs validation to avoid zero or negative values and possibility to create a triangle.
     */
    private void checkInput() {
        checkOverflow();
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Value of the sides couldn't be negative or zero. The triangle cannot be built.");
        } else if (sideB + sideC < sideA || sideA + sideC < sideB || sideA + sideB < sideC) {
            throw new IllegalArgumentException("Sum of two sides must be greater than a third side. The triangle cannot be built.");
        }
    }

    /**
     * Performs validation to avoid overflow of double data type.
     */
    private void checkOverflow() {
        double toCheck = sideA + sideB + sideC;
        if (Double.isInfinite(toCheck)) {
            throw new ArithmeticException("Input values " + sideA + ", " + sideB + ", and " + sideC + " causes to double data type overflow in getArea() method.");
        }
    }
}
