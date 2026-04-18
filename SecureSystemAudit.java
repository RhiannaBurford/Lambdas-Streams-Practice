import java.util.ArrayList;

public class SecureSystemAudit {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Admin");
        names.add("Joe");
        names.add("Jim");
        names.add("Sally");
        names.add("User");
        names.add("Violet");
        names.add("Zoe");
        names.add("Zane");

        int sum = names.stream().filter(x -> x.length() > 3).filter(x -> !x.startsWith("Z")).map(x -> x.toLowerCase())
        .mapToInt(x -> x.length()).sum();
        System.out.println(sum);
    }
}
