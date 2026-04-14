import java.util.Scanner;

@FunctionalInterface
interface StringLength{
    int length(String a);
}

public class Exercise6 {
    /* Write a lambda expression to take a string and return its length. */
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sinput.nextLine();
        StringLength len = (a) -> a.length();
        System.out.println(len.length(word));
        sinput.close();
    }
}
