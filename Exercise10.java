import java.util.function.BinaryOperator;


public class Exercise10 {
    /* Java provides a built-in interface called BinaryOperator<T> which takes two 
    arguments of type T and returns one result of type T.
    Task: Write a lambda expression for BinaryOperator<Integer> that returns the 
    product (multiplication) of two integers. */

    public static void main(String[] args){
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        int result = multiply.apply(5, 6);
        System.out.println(result);
    }
}
