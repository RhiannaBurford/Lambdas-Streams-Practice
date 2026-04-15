import java.util.Scanner;

@FunctionalInterface
interface combiner {
    String combineNames(String a, String b);
}

public class CustomFormatter {
    public static void main(String[] args){
        /* You want to create a system that takes two strings 
        (a First Name and a Last Name) and combines them into one formatted full name */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = sinput.nextLine();
        System.out.print("Enter your last name: ");
        String last = sinput.nextLine();

        combiner format = (a, b) -> b.toUpperCase() + ", " + a;
        System.out.println("Your combined name is " + format.combineNames(first, last));
        sinput.close();
    }
}
