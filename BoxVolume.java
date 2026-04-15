import java.util.Scanner;

@FunctionalInterface
interface calculator {
    double volume(double width, double length, double depth);
}

public class BoxVolume {
    public static void main (String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sinput.nextDouble();
        System.out.print("Enter depth: ");
        double depth = sinput.nextDouble();
        System.out.print("Enter length: ");
        double length = sinput.nextDouble();
        calculator BoxVolumeCalc = (a, b, c) -> a * b * c;
        System.out.println("The box volume is " + BoxVolumeCalc.volume(width, length, depth));

        sinput.close();
    }
}
