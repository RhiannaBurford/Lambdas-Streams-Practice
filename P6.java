import java.util.List;
import java.util.Arrays;

public class P6 {
    public static void main(String[] args){
        List<Integer> grades = Arrays.asList(45, 88, 72, 91, 34, 100);

        double avg = grades.stream().filter(x -> x > 40).mapToDouble(x -> x).average().orElse(0.0);
        // you need some sort of parameteres in .mapToDouble();

        System.out.println(avg);
    }
}
