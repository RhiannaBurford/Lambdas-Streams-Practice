import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VIPGuessList {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>(Arrays.asList(18, 25, 20, 31, 45, 19, 22));

        // Instructions: "Remove if the age is less than 21"
        ages.removeIf(age -> age < 21);

        // Instructions: "For each remaining age, print this message"
        ages.forEach(age -> System.out.println("Guest age: " + age));
    }
}
