// The interface must have exactly one abstract method
@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class Exercise1 {
    public static void main(String[] args) {
        // This is the lambda line
        Sum s = (a, b) -> a + b;
        // Call the lambda implementation of add
        System.out.println("Sum = " + s.add(5, 7));
    }
}
