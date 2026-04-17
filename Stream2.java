import java.util.*;

public class Stream2 {
    public static void main(String[] args) {
        List<String> guests = Arrays.asList("Michael", "Sarah", "Michelle", "John", "Marcus", "Anna");

        // We use long because .count() returns a long integer
        long mCount = guests.stream()
                            .filter(name -> name.startsWith("M"))
                            .count();

        System.out.println("Number of guests starting with M: " + mCount);
    }
}