@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class Exercise1 {
    public static void main(String[] args) {
        Sum s = (a, b) -> a + b;
        System.out.println("Sum = " + s.add(5, 7));
    }
}
