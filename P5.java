import java.util.Arrays;
import java.util.List;

public class P5 {
    public static void main(String[] args){
        List<Double> prices = Arrays.asList(10.0, 25.50, 5.0, 100.0, 50.0);

        double sum = prices.stream().filter(x -> x > 20.0).mapToDouble(x -> x).sum();
        System.out.println("Sum: " + sum);
    }
}
