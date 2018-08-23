package Shapes;

import ColorUtility.ColorUtils;

import java.awt.Color;

public abstract class AbstractShape {
    private Color color;

    public AbstractShape(Color c) {
        color = c;
    }

    public void toDraw() {
        /*
        Some method to draw shapes in GUI
         */
    }

    abstract double getArea();

    public String toString(){
        ColorUtils colorUtils = new ColorUtils();
        return "Figure is " + this.getClass().getSimpleName()
                          + ". Color: " + colorUtils.getColorNameFromRgb(color.getRed(), color.getGreen(), color.getBlue())
                          + ". Area: " + getArea() + " sq. units. ";
    }
}