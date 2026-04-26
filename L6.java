import java.util.LinkedList;
import java.util.function.Predicate;

public class L6 {
    public static void main(String[] args){
        LinkedList<Integer> IDs = new LinkedList<Integer>();
        IDs.add(302);
        IDs.add(259023);
        IDs.add(234);
        IDs.add(1234);
        IDs.add(2353);

        Predicate<Integer> isAllowed = (a) -> (a % 2 == 0 && a > 1000);

        for (Integer id : IDs){
            if (isAllowed.test(IDs.get(id))){
                System.out.println(IDs.get(id) + " is allowed.");
            }
            else{
                System.out.println(IDs.get(id) + " is NOT allowed.");
            }
        }
    }
}
