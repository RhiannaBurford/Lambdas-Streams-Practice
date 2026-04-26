import java.util.LinkedList;

public class L2 {

    /* We want our lambda to: Print "Processing: " followed by the string. Return the uppercase version of that string. */
    public static void main (String[] args){
        /* How would you write a lambda expression that takes a single 
        String s and returns that string in uppercase? */

        String s = "Lambdas are cool";
        String t = "Bist du dir sicher?";
        String u = "Natuerlich!";
        LinkedList<String> messages = new LinkedList<String>();
        messages.add(s);
        messages.add(t);
        messages.add(u);
        messages.stream().forEach(a -> {
            System.out.print("Processing: " + a + "\n");
            System.out.println(a.toUpperCase());
        });
    }
}
