import java.util.Scanner;

@FunctionalInterface
interface BonusCalculator{
    double calculate(int y, double s, String dp);
}

public class EmployeeBonus {
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.print("How many years have you been working at this company? ");
        int years = sinput.nextInt();
        System.out.print("What is your current salary? ");
        double salary = sinput.nextDouble();
        sinput.nextLine(); // REMEMBER THIS - THIS IS A COMMON BUG!
        System.out.print("What department are you in? ");
        String dpment = sinput.nextLine();
        BonusCalculator firstBonus = (y, s, dp) -> 
        (dp.equals("Sales") ? s * 0.2 : (y > 5)? s * 0.1 : s * 0.05);
        System.out.println("Your bonus is " + firstBonus.calculate(years, salary, dpment));
        sinput.close();
    }
}
