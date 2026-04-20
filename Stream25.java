import java.util.LinkedList;

public class Stream25 {
    public static void main(String[] args){
        /* Sort a List of Strings in Ascending Order */
        LinkedList<String> words = new LinkedList<String>();
        words.add("Hello");
        words.add("World");
        words.add("Avocado");
        words.add("Paddington");
        words.add("Greetings");
        words.add("Greetings");
        words.add("World");

        words.stream().sorted().forEach(n -> System.out.println(n));
    }
}
