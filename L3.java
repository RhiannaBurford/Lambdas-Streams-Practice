
import java.util.function.BinaryOperator;

public class L3 {

    public static void main(String[] args){
        /* The Task: Write a one-line lambda expression that takes two integers, x and y, 
        and returns their product (multiplies them). */

        // Our lambda will be stored in this variable
        BinaryOperator<Integer> multiplier = (x, y) -> x * y;

        // We use .apply() to run the code inside the lambda
        int result = multiplier.apply(10, 8);
        
        System.out.println(result);
    }
}
