package Shapes.RandShapesCreator;

import Shapes.AbstractShape;
import Shapes.Square;

import java.awt.Color;

import static Shapes.RandShapesCreator.ParameterizedRandVal.parameterizedRandVal;

public class CreateSquare implements RandParamShapesCreator {

    public AbstractShape CreateShape() {
        return new Square(parameterizedRandVal(min, max),
                          new Color(rand.nextInt(colorBound),
                                    rand.nextInt(colorBound),
                                    rand.nextInt(colorBound)));
    }
}
