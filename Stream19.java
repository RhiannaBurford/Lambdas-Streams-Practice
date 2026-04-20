import java.util.LinkedList;

public class Stream19 {
    public static void main(String[] args){
        /* Check if a List Contains a Specific Element */

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        int specialNum = 20;

        boolean contains = nums.stream().anyMatch(n -> n == specialNum);
        if (contains){
            System.out.println("The special number is in the list ");
        }
        else {
            System.out.println("The special number is NOT in the list");
        }
    }
}
