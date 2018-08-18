package Shapes.RandShapesCreator;

import Shapes.AbstractShape;
import Shapes.Trapezoid;

import java.awt.Color;

import static Shapes.RandShapesCreator.ParameterizedRandVal.parameterizedRandVal;

public class CreateTrapezoid implements RandParamShapesCreator {
    @Override
    public AbstractShape CreateShape() {
        return new Trapezoid(parameterizedRandVal(min, max),
                             parameterizedRandVal(min, max),
                             parameterizedRandVal(min, max),
                             new Color(rand.nextInt(colorBound),
                                       rand.nextInt(colorBound),
                                       rand.nextInt(colorBound)));
    }
}
