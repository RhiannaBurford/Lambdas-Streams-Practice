import java.util.List;
import java.util.LinkedList;

public class Stream23 {
    public static void main(String[] args){
        /* Convert a List of Integers to Their Squares */
        List<Integer> nums = new LinkedList<Integer>(); // should probably change to long if nums get big
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        nums.stream().map(n -> n*n).forEach(n -> System.out.println(n));
    }
}
