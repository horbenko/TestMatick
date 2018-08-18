package Shapes.RandShapesCreator;

import Shapes.AbstractShape;
import Shapes.Triangle;

import java.awt.Color;

import static Shapes.RandShapesCreator.ParameterizedRandVal.parameterizedRandVal;

public class  CreateTriangle implements RandParamShapesCreator {
    @Override
    public AbstractShape CreateShape() {
        return new Triangle(parameterizedRandVal(min, max),
                            parameterizedRandVal(min, max),
                            parameterizedRandVal(min, max),
                            new Color(rand.nextInt(colorBound),
                                      rand.nextInt(colorBound),
                                      rand.nextInt(colorBound)));
    }
}
