import java.util.Scanner;
import java.util.ArrayList;


public class LabSampleValidator {
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        ArrayList<String> masterList = new ArrayList<String>();
        masterList.add("Oxygen");
        masterList.add("Nitrogen");
        masterList.add("Hydrogen");
        masterList.add("Carbon");
        ArrayList<String> samples = new ArrayList<String>();
        String sample = "";
        
        for (int i = 0; i < 5; i++){
            System.out.print("Enter sample " + (i + 1) + ": ");
            sample = sinput.nextLine();
            samples.add(sample);
        }

        samples.stream().filter(x -> !x.isEmpty()).filter(x -> masterList.contains(x)).
            forEach(x -> System.out.println("APPROVED: " + x.toUpperCase()));
    

        sinput.close();
    }
}
