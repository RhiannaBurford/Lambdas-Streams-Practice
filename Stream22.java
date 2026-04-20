import java.util.LinkedList;

public class Stream22 {
    public static void main(String[] args){
        /* Convert a List of Strings to Uppercase */
        LinkedList<String> words = new LinkedList<String>();
        words.add("Hello");
        words.add("World");
        words.add("Avocado");
        words.add("Paddington");
        words.add("Greetings");

        words.stream().map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
    }
}
