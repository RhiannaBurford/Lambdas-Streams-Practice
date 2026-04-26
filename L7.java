import java.util.LinkedList;
import java.util.function.Function;

public class L7 {
    public static void main(String[] args){
        /* Create a LinkedList<String> with names: "ana", "bob", "charles". */
        LinkedList<String> names = new LinkedList<String>();
        names.add("ana");
        names.add("bob");
        names.add("charles");

        // Using method references
        Function<String, String> upperCaseMapper = (String::toUpperCase);

        for (int i = 0; i < names.size(); i++){
            System.out.println(upperCaseMapper.apply(names.get(i)));
        }
    }
}
