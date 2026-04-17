import java.util.*;

public class Stream5 {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(25, 30, 18, 44, 15, 28);

        // Fill in the blank
        boolean hasUnderage = ages.stream()
                                  .anyMatch(age -> age < 18);

        System.out.println("Underage guest present: " + hasUnderage);
    }
}