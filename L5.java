import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class L5 {

    public static void main(String[] args){

        // 1. Create a LinkedList of integers: 85, 40, 75, 20, 90.

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(85);
        nums.add(40);
        nums.add(75);
        nums.add(20);
        nums.add(90);

        // 2. Write a Predicate (or just the lambda itself) that identifies "Failing" grades (any grade less than 50).
        Predicate<Integer> failing = (x) -> (x < 50);

        // A better way to do this is through using streams
        for (int i = 0; i < nums.size(); i++){
            if (failing.test(nums.get(i))){
                nums.remove(i);
            }
        }

        List<Integer> passingGrades = nums.stream()
        .filter(n -> n >= 50)
        .toList(); // Converts the stream back into a List


        for (int i = 0; i < passingGrades.size(); i++){
            System.out.println(passingGrades.get(i));
        }
    }
}

