import java.util.Scanner;

@FunctionalInterface
interface CheckGrades {
    boolean check(String c, int s);
}

public class GradeAuditor {
    public static void main(String[] args){
        /* The lambda should return true if:
        The course is Honors and the score is 70 or higher.
        OR the course is NOT Honors and the score is 50 or higher. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter course: ");
        String course = sinput.nextLine().toLowerCase();
        System.out.print("Enter score: ");
        int score = sinput.nextInt();
        CheckGrades first = (c, s) -> ((c.equals("honors") && s >= 70) || (!c.equals("Honors") && s >= 50));
        if (first.check(course, score)){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        sinput.close();
    }
}
