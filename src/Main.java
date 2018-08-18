import Shapes.AbstractShape;
import Shapes.RandShapesCreator.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        int maxShapesQuantity = 15;

        Random rand = new Random();

        AbstractShape[] array = new AbstractShape[(rand.nextInt(maxShapesQuantity)+1)];

        Map<Integer, RandParamShapesCreator> shape = new LinkedHashMap<>();
        shape.put(1, new CreateCircle());
        shape.put(2, new CreateSquare());
        shape.put(3, new CreateTrapezoid());
        shape.put(4, new CreateTriangle());


        for(int i = 0; i < array.length; i++) {
            array[i] = shape.get(rand.nextInt(shape.size())+1).CreateShape();
        }
        System.out.println("Total amount of shapes: " + array.length + ".");
        for(AbstractShape i : array) {
            //System.out.println(i.toString());
            System.out.println(pretty(i.toString()));
        }
    }

    /**
     * Configures the input string in an easy-to-read format reducing digits after the comma for float format.
     * @param source input string
     * @return configured string
     */
    private static String pretty(String source) {
        int digitsAfterComma = 2;
        StringBuilder pretty = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+\\.");
        Matcher matcher = pattern.matcher(source);
        int i = 0;
        while (matcher.find()) {
            pretty.append(source.split("\\d+.\\d+")[i]).append(source.substring(matcher.start(), matcher.end() + digitsAfterComma)); //reduced to two digits after comma
            i++;
        }
        pretty.append(source.split("\\d+.\\d+")[i]);
        return pretty.toString();
    }
}
