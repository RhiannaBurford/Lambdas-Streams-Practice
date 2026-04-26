import java.util.function.Predicate;

public class L4 {

    public static void main(String[] args){
        

        Predicate<Integer> isLarge = (x) -> (x > 100);// Your lambda goes here;

        // 2. Use the .test() method to check the number 150
        boolean result = isLarge.test(150);

        System.out.println("Is 150 large? " + result);
    }
}
