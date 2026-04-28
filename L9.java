import java.util.Comparator;
import java.util.LinkedList;

public class L9 {

    public static void main(String[] args){

        LinkedList<Student> students = new LinkedList<Student>();

        students.stream().filter(x -> x.getGPA() >= 3.5).sorted(Comparator.comparing(Student::getName)).forEach(x ->
            System.out.println(x.getName())
        );
    }
}
