import java.util.LinkedList;

public class Stream13 {
    public static void main(String[] args){
        /* Find the Sum of All Elements in a List */

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        int sum = nums.stream().mapToInt(n -> n).sum();
        // nums.stream() gives you a Stream<Integer> - a stream of objects, not primitives.
        System.out.println(sum);
    }
}
