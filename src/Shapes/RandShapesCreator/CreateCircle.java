package Shapes.RandShapesCreator;

import Shapes.AbstractShape;
import Shapes.Circle;

import java.awt.Color;

import static Shapes.RandShapesCreator.ParameterizedRandVal.parameterizedRandVal;

public class CreateCircle implements RandParamShapesCreator {

    @Override
    public AbstractShape CreateShape() {
        return new Circle(parameterizedRandVal (min, max),
                          new Color(rand.nextInt(colorBound),
                                    rand.nextInt(colorBound),
                                    rand.nextInt(colorBound))
        );
    }
}
