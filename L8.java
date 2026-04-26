import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class L8 {

    public static void main(String[] args){

        /* Create a LinkedList<Integer> with values: -5, -10, -15. */

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(-5);
        numbers.add(-10);
        numbers.add(-15);


        /* Define a UnaryOperator<Integer> absoluteMapper.
        Assign it the Method Reference for the static method Math.abs */

        UnaryOperator<Integer> absoluteMapper = (a) -> Math.abs(a);

        for (Integer n : numbers){
            System.out.println(absoluteMapper.apply(n));
        }
    }
}
