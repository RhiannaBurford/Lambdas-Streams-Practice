import java.util.LinkedList;

public class Stream10 {

    public static void main (String[] args){
        LinkedList<String> food = new LinkedList<String>();
        food.add("Apple");
        food.add("Coconut");
        food.add("Salmon");
        food.add("Orange");
        food.add("Chicken");
        food.add("Flapjack");

        food.stream().filter(x -> x.startsWith("A")).map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
    }
}
