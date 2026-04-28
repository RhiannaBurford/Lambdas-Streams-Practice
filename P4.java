import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P4 {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Joe", "Bob", "Alice", "Zeldeefa", "Mo");

        List<Integer> lengths = names.stream().filter(x -> x.startsWith("A") || x.startsWith("Z"))
        .map(x -> x.length())
        .collect(Collectors.toList());

        for (Integer i : lengths){
            System.out.println(i);
        }
    }

}
