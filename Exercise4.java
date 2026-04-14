import java.util.LinkedList;

@FunctionalInterface
interface EvenOddCheck{
    boolean isEven(int a);
}

public class Exercise4 {
    /* Write a Java program to implement a lambda expression to filter 
    out even and odd numbers from a list of integers. */
    public static void main (String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> oddList = new LinkedList<Integer>();
        LinkedList<Integer> evenList = new LinkedList<Integer>();
        // Populating list
        list.add(4);
        list.add(45);
        list.add(24);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(6);
        EvenOddCheck num = (a) -> (a % 2 == 0);
        for (int i = 0; i < list.size(); i++){
            if (num.isEven(list.get(i))){
                evenList.add(list.get(i));
            }
            else {
                oddList.add(list.get(i));
            }
        }

        System.out.println("Printing even numbers: ");
        for (int j = 0; j < evenList.size(); j++){
            System.out.print(evenList.get(j) + ", ");
        }
        System.out.println("\nPrinting odd numbers: ");
        for (int k = 0; k < oddList.size(); k++){
            System.out.print(oddList.get(k) + ", ");
        }
    }
    
}
