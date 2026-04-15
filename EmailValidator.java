import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class EmailValidator {
    public static void main(String[] args){
        /* "Email Validator" Task
        Scenario: You are building a sign-up form. You need to check if an email is valid and then
        "process" it by printing a success message.

        Part A: The Filter (Predicate<T>)
        A Predicate takes one input and returns a boolean.
        Task: Create a Predicate<String> named isValidEmail.
        Logic: It should return true if the string contains the @ symbol.

        Part B: The Action (Consumer<T>)
        A Consumer takes one input and returns nothing (void).
        Task: Create a Consumer<String> named sendWelcome.
        Logic: It should print: "Registration successful for: [email]". */

        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sinput.nextLine();
        Predicate<String> isValidEmail = (a) -> (a.contains("@"));
        Consumer<String> sendWelcome = (a) -> System.out.println("Registration successful for : "+ a);
        if (isValidEmail.test(email)){
            sendWelcome.accept(email);
        }
        
        sinput.close();
    }
}
