import java.util.LinkedList;


@FunctionalInterface
interface ListCounting{
    int countList(LinkedList<String> a, char c);
}

public class Exercise9 {
    /* Write a Java program that uses a lambda expression to count how many 
    strings in a list start with a given letter. */

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        char letter = 'C';
        list.add("Cornflakes");
        list.add("Weetabix");
        list.add("Branflakes");
        list.add("Granola");
        list.add("Porridge");
        list.add("Cabbage");
        list.add("Cucumber");

        // Parameter name must be different to variable already declared in main method
        ListCounting rule = (a, c) -> {
        int count = 0;
        for (String word : a) {
            if (word.charAt(0) == c) {
                count++;
            }
        }
        return count;
        };
        
        System.out.println(rule.countList(list, letter) + " occurrences in the list start with " + letter);
        
    }
}
