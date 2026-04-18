import java.util.LinkedList;

public class Stream8 {
    public static void main(String[] args){
        LinkedList<Integer> IDs = new LinkedList<Integer>();
        IDs.add(30);
        IDs.add(35);
        IDs.add(240);
        IDs.add(23);

        boolean is303inList = IDs.stream().anyMatch(n -> n == 303);
        if (is303inList){
            System.out.println("303 is in the list");
        }
        else {
            System.out.println("303 is not in the list");
        }
    }
}
