import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> myArray = new ArrayList<>();
        System.out.println("How many walls you need to paint?");
        int walls = myScanner.nextInt();
        System.out.println("How big is the bucket size in liters?");
        double bucket = myScanner.nextDouble();
        System.out.println("Coverage in square meters of the paint?");
        double coverage = myScanner.nextDouble();
        System.out.println("How many coats?");
        double coats = myScanner.nextDouble();
        double atotal = 0, areatotal = 0;
        for (int j = 1; j <= walls; j++) {
            double w = 0;
            System.out.println("\n" + "DETAILS ABOUT WALL NO. " + j + "\n");
            System.out.println("Enter Width");
            double width = myScanner.nextDouble();
            System.out.println("Enter Height");
            double height = myScanner.nextDouble();
            System.out.println("\n" + "Entire area needs to be painted? (answer in y or n)");
            String check = myScanner.next();
            double area = height * width;
            if (check.equals("n") || check.equals("N")) {
                System.out.println("\n" + "How many areas don't need to be painted (any windows/doors/etc to avoid)? ");
                int number = myScanner.nextInt();
                for (int i = 1; i <= number; i++) {
                    System.out.println("Enter Dimensions of area  number " + (i));
                    System.out.println("Enter Width");
                    double nowidth = myScanner.nextDouble();
                    System.out.println("Enter Height");
                    double noheight = myScanner.nextDouble();
                    double noarea = nowidth * noheight;
                    area = area - noarea;

                }
                areatotal = areatotal + area;
                w = area;
            }
            else
                 {
                    area = height * width;
                    areatotal = areatotal + area;
                    w = area;
                }
            w = area / bucket / coverage;
            myArray.add(" For wall no. " + (j) + " you will need " + round(w) + " buckets for one coat");

        }

        System.out.println(myArray);

        atotal = areatotal / bucket / coverage;
        long a = round(atotal);
        System.out.println("\n" + "\n" + "You will need  " + (a*coats) + " buckets in total with " + coats + " coats");
    }
}





