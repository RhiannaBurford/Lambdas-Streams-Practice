import java.util.*;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 18, 7, 25);

        numbers.stream()
               .filter( /* logic to keep numbers >= 10 */ n -> n >= 10)
               .map( /* logic to multiply by 2 */ n -> n * 2)
               .forEach( /* logic to print */ n -> System.out.print(n));
    }
}