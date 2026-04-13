import java.util.Scanner;

@FunctionalInterface
interface CheckEmpty {
    boolean checkEmpty(String s);
}


public class Exercise2 {
    /* Write a Java program to implement a lambda expression to check if a 
    given string is empty */
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sinput.nextLine();
        // Using a method reference is clear
        CheckEmpty isEmpty = String::isEmpty;
        System.out.println(isEmpty.checkEmpty(input) 
        ? "The string is empty" 
        : "The string is not empty");
        sinput.close();
    }
}
