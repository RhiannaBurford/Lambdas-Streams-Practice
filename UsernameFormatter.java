import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;

public class UsernameFormatter {
    public static void main(String[] args){
        /* Scenario: When a user signs up, their username might be messy (extra spaces, lowercase). 
        You want to clean it up before saving it.

        Part A: The Cleaner (UnaryOperator<String>)
        Task: Create a UnaryOperator<String> named formatUsername.

        Logic: It should take a string, remove any leading/trailing whitespace (using .trim()), 
        and convert it to lowercase.

        Part B: The Inspector (Predicate<String>)
        Task: Create a Predicate<String> named isLongEnough.

        Logic: It should return true if the username is at least 5 characters long. */
        
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sinput.nextLine();
        UnaryOperator<String> formatUsername = (a) -> a.trim().toLowerCase();
        Predicate<String> isLongEnough = (a) -> a.length() >= 5;

        String formatted = formatUsername.apply(username);
        if (isLongEnough.test(formatted)){
            System.out.println("Your username is long enough");
        }
        else {
            System.out.println("Your username is not long enough");
        }
        sinput.close();
    }
}
