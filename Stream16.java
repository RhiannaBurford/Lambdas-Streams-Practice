import java.util.LinkedList;

public class Stream16 {
    public static void main(String[] args){
        /* Find the Maximum Element in a List */

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        int max = nums.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max);

    }
}
