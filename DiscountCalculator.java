import java.util.Scanner;
import java.util.function.BiFunction;

public class DiscountCalculator {
    public static void main(String[] args){
        /* Scenario: You have a product price and a discount percentage. You need to calculate the final price.
        Task: Create a BiFunction<Double, Integer, Double> named calculateDiscount.
        Logic: It takes a Double (price) and an Integer (percent off). It should return the new price as a Double. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter a price: ");
        double cost = sinput.nextDouble();
        System.out.print("Enter the percentage off: ");
        int off = sinput.nextInt();
        BiFunction<Double, Integer, Double> calculateDiscount = (price, percentOff) -> (price * (1 - (percentOff/100.0)));

        System.out.println("The new price is " + calculateDiscount.apply(cost, off));
        sinput.close();
    }
}
