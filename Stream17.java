import java.util.LinkedList;

public class Stream17 {
    public static void main(String[] args){
        /* Find the Minimum Element in a List */
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        int min = nums.stream().reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a : b);
        System.out.println(min);
    }
}
