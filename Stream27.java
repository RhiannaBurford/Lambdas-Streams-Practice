import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

public class Stream27 {
    public static void main(String[] args){
        /* Sort a List of Strings by Their Length */
        List<String> words = new LinkedList<String>();
        words.add("Hello");
        words.add("World");
        words.add("Avocado");
        words.add("Paddington");
        words.add("Greetings");
        words.add("Greetings");
        words.add("World");

        words.stream().sorted(Comparator.comparingInt(String::length)).forEach(n -> System.out.println(n));
    }
}
