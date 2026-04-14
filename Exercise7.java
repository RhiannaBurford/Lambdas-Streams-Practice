
@FunctionalInterface
interface printMessage {
    void output(String a);
}

public class Exercise7 {
    /* use a lambda expression to print "Hello". */
    public static void main(String[] args){
        printMessage out = (String a) -> System.out.println(a);
        out.output("Hello");
    }
    
}
