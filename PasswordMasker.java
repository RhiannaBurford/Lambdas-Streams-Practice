import java.util.Scanner;

@FunctionalInterface
interface Masker {
    String replace(String a, char b);
}

public class PasswordMasker {
    public static void main(String[] args){
        /* You want a custom interface that takes a password and a "mask" character (like *), and returns a string 
        where every character of the password is replaced by that mask. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sinput.nextLine();
        System.out.print("Enter the mask character: ");
        char mask = sinput.nextLine().charAt(0);
        
        Masker maskedPassword = (pw, mk) -> {
            String result = "";
            for (int i = 0; i < pw.length(); i++) {
                result = result + mk;
            }
            return result;
            };

        System.out.println("Masked password: " + maskedPassword.replace(password, mask));
        sinput.close();
    }
}
