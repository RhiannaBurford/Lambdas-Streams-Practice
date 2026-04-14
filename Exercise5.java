import java.util.LinkedList;


@FunctionalInterface
interface SortAlphabeticalOrder{
    int beforeAlpha(String a, String b);
}

public class Exercise5 {
    /* Write a Java program to implement a lambda expression to sort a
    list of strings in alphabetical order. */
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("David");
        list.add("Bob");
        list.add("Charlie");
        list.add("Ethan");
        list.add("Rowan");
        list.add("Sam");
        SortAlphabeticalOrder isBefore = (a, b) -> (a.compareToIgnoreCase(b));
        String first;
        String second;

        for (int j = 0; j < list.size() -1; j++){
            for (int i = 0; i < list.size() - 1; i++){
                first = list.get(i);
                second = list.get(i+1);
            if (isBefore.beforeAlpha(first, second) > 0){
                // Swap the values
                list.set(i, second);
                list.set(i+1, first);
            }
        }
        }

        for (int k = 0; k < list.size(); k++){
            System.out.println(list.get(k));
        }
        

    }
}
