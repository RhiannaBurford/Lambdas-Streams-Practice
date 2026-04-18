import java.util.LinkedList;

public class Stream7 {
    public static void main(String[] args){
        LinkedList<Integer> stock = new LinkedList<Integer>();
        stock.add(10);
        stock.add(0);
        stock.add(20);
        stock.add(15);

        boolean notAllAvailable = stock.stream()
        .anyMatch(x -> x <= 0);

        if (notAllAvailable){
            System.out.println("Not all of them are available");
        }
        else {
            System.out.println("All of them are available");
        }

    }
}
