import java.util.Scanner;

@FunctionalInterface
interface ConvertTemp{
    double convert(double t, String u);
}

public class TempConverter {
    public static void main(String[] args){
        /* Temperature converter */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sinput.nextDouble();
        sinput.nextLine();
        System.out.print("Enter units you want to convert to: ");
        String units = sinput.nextLine();
        ConvertTemp first = (t, u) -> u.equals("C") ? ((t - 32.0) * (5.0/9.0)) : ((t * 9.0/5.0) + 32.0);
        System.out.println("The temperature is " + first.convert(temp, units));
        sinput.close();
    }
}
