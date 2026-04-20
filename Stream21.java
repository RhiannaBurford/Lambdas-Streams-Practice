import java.util.LinkedList;

public class Stream21 {
    public static void main(String[] args){
        /*Filter Out Odd Numbers from a List */

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        nums.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.println(n));

    }
}
