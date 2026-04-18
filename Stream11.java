import java.util.ArrayList;

public class Stream11 {
    public static void main(String[] args){
        ArrayList<Integer> purchases = new ArrayList<Integer>();
        purchases.add(300);
        purchases.add(24);
        purchases.add(35);
        purchases.add(245);
        purchases.add(120);
        purchases.add(23);

        double sum = purchases.stream().filter(x -> x > 100).mapToDouble(x -> x * 0.9).sum();

        System.out.println(sum);
    }
}
