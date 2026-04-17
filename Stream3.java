import java.util.*;

public class Stream3 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "test@gmail.com", 
            "user@yahoo.co.uk", 
            "admin@outlook.com", 
            "info@company.net", 
            "hello@service.com", 
            "dev@code.io", 
            "staff@web.com"
        );

        emails.stream()
        .filter(n -> n.endsWith(".com"))
        .limit(3)
        .forEach(n -> System.out.println(n));
        
    }
}