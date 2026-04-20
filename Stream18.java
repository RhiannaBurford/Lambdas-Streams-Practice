import java.util.LinkedList;

public class Stream18 {
    public static void main(String[] args){
        /* Count the Number of Elements in a List */

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        long count = nums.stream().mapToInt(n -> n).count();

        System.out.println(count);
    }
}
