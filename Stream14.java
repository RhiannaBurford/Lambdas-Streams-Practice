import java.util.LinkedList;

public class Stream14 {
    public static void main(String[] args){
        //Find the Product of All Elements in a List

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(10);
        nums.add(12);
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(204);

        int product = nums.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);
    }
}
