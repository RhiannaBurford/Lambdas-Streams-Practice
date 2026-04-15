import java.util.Scanner;

@FunctionalInterface
interface PasswordCheck {
    boolean check(String s, char c);
}

public class StrongPasswordValidator {
    public static void main(String[] args){
        /* The password is considered valid (returns true) ONLY if it meets two conditions:
        It is at least 8 characters long.
        It contains the requiredChar. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pwd = sinput.nextLine();
        char specialChar = '%';
        PasswordCheck try1 = (s, c) -> (s.length() >= 8 && s.contains(String.valueOf(c)));
        if (try1.check(pwd, specialChar)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Not valid");
        }
        sinput.close();
    }
}
