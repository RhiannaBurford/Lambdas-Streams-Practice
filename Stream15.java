import java.util.LinkedList;


public class Stream15 {
    public static void main(String[] args){
        // Find the Average of All Elements in a List

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        int sum = nums.stream().mapToInt(n -> n).sum();
        System.out.println("The average is " + ((double)sum/nums.size()));
    }
}
