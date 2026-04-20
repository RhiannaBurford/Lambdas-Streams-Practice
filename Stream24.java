import java.util.LinkedList;

public class Stream24 {
    public static void main(String[] args){
        /* Remove Duplicate Elements from a List */
        LinkedList<String> words = new LinkedList<String>();
        words.add("Hello");
        words.add("World");
        words.add("Avocado");
        words.add("Paddington");
        words.add("Greetings");
        words.add("Greetings");
        words.add("World");

        words.stream().distinct().forEach(n -> System.out.println(n));

    }
}
