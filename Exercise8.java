import java.util.Scanner;

@FunctionalInterface
interface checkString{
    boolean containsChar(String s, String c);
}

public class Exercise8 {
    public static void main(String[] args){
        /* Write a Java program that uses a lambda expression to check 
        whether a given string contains a specific character. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sinput.nextLine().toLowerCase();
        System.out.print("Enter a character to search for: ");
        String character = sinput.nextLine().toLowerCase();
        checkString check = (String s, String c) -> s.contains(c);
        System.out.println(check.containsChar(word, character));

    }
}
