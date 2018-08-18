package Shapes.RandShapesCreator;

import java.util.concurrent.ThreadLocalRandom;

class ParameterizedRandVal {
    static double parameterizedRandVal(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}
