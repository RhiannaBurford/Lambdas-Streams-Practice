import java.util.LinkedList;

public class Stream9 {
    public static void main(String[] args){
        LinkedList<Double> salaries = new LinkedList<Double>();
        salaries.add(4000.0);
        salaries.add(2500.0);
        salaries.add(3500.0);
        salaries.add(3452.5);

        salaries.stream().filter(n -> n < 3000).map(n -> 1.1 * n)
        .forEach(n -> System.out.println(n));
        
    }
}
