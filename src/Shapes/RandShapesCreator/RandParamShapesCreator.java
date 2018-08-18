package Shapes.RandShapesCreator;

import Shapes.AbstractShape;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public interface RandParamShapesCreator {
    Random rand = new Random();
    double min = 15.0;
    double max = 25.0;
    int colorBound = 256;
    AbstractShape CreateShape();
}

