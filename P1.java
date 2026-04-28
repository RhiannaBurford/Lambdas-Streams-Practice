@FunctionalInterface
public interface StringFormatter {
    String format(String input); // The single abstract method
}

public class P1 {
    public static void main(String[] args){

        StringFormatter exclamation = (s) -> s + "!";
        System.out.println(exclamation.format("Hello")); // Outputs: Hello!
    }
}
