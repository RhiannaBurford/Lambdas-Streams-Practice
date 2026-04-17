import java.util.*;

public class Stream4 {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(10.50, 45.0, 15.0, 99.99, 5.0);

        // Write the stream below:
        prices.stream()
        .filter(n -> n > 20.00)
        .map(n -> "$" + n )
        .forEach(n -> System.out.println(n));

    }
}