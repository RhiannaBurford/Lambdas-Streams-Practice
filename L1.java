import java.util.LinkedList;

public class L1 {

    public static void main (String[] args){
        /* How would you write a lambda expression that takes a single 
        String s and returns that string in uppercase? */

        String s = "Lambdas are cool";
        LinkedList<String> messages = new LinkedList<String>();
        messages.add(s);

        messages.stream().forEach(a -> System.out.println(a.toUpperCase()));
    }
}
