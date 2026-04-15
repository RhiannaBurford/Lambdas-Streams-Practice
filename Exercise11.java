import java.util.Scanner;
import java.util.function.Function;

public class Exercise11 {
    public static void main(String[] args){
        /* The Function<T, R> interface is used to transform an input into a different output.
        Goal: Create a lambda that takes a String and returns an Integer representing its length. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sinput.nextLine();
        Function<String, Integer> returnLength = (a) -> a.length();
        System.out.println("The length of " + word + " is " + returnLength.apply(word));

        sinput.close();
    }
}
