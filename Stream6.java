import java.util.ArrayList;
import java.util.List;

public class Stream6 {
    public static void main(String[] args){
        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(100);
        scores.add(76);

        // Check if any score is equal to 100
        boolean perfectScore = scores.stream()
                                     .anyMatch(s -> s == 100);

        System.out.println("Perfect score found: " + perfectScore);
    }
}
