import java.util.ArrayList;

public class Stream12 {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("There");
        words.add("I");
        words.add("Hope");
        words.add("You");
        words.add("Have");
        words.add("A");
        words.add("Nice");
        words.add("Day");

        int sum = words.stream().mapToInt(x -> x.length()).sum();

        System.out.println(sum);
    }
}
