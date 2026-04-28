import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class P3 {

    public static void main(String[] args){
        List<Integer> scores = new LinkedList<Integer>();
        scores.add(2);
        scores.add(240);
        scores.add(20);

        List<Integer> finalScores = scores.stream().filter(x -> x < 100).map(x -> x + 10).collect(Collectors.toList());
        // it says cannot convert from stream<Object> to List<Integer>

        for (int i = 0; i < finalScores.size(); i++){
            System.out.println(scores.get(i));
        }
    }

}
