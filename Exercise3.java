import java.util.LinkedList;

@FunctionalInterface
interface Upper{
    String toUpper(String s);
}

@FunctionalInterface
interface Lower{
    String toLower(String s);
}

public class Exercise3 {
    /* Write a Java program to implement a lambda expression to convert
     a list of strings to uppercase and lowercase. */
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> upperList = new LinkedList<String>();
        LinkedList<String> lowerList = new LinkedList<String>();
        list.add("Rhianna");
        list.add("Rowan");
        list.add("Rebecca");
        list.add("Connor");
        list.add("Reuben");
        list.add("Nina");
        Upper supp = String::toUpperCase;
        Lower slow = String::toLowerCase;

        for (int i = 0; i < list.size(); i++){
            upperList.add(supp.toUpper(list.get(i)));
            lowerList.add(slow.toLower(list.get(i)));
        }

        for (int j = 0; j < upperList.size(); j++){
            System.out.println("Upper: " + upperList.get(j));
            System.out.println("Lower: " + lowerList.get(j));
        }
    }
}
