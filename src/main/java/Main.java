import java.util.Scanner;
import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many walls you need to paint?");
        int walls = myScanner.nextInt();
        System.out.println("How big is the bucket size in liters?");
        double bucket = myScanner.nextDouble();
        System.out.println("Coverage in square meters of the paint?");
        double coverage = myScanner.nextDouble();
        double atotal = 0;
        double areatotal = 0;
        for (int j = 1; j <= walls; j++) {
            System.out.println("\n" + "DETAILS ABOUT WALL NO. " + j + "\n");
            System.out.println("Enter Width");
            double width = myScanner.nextDouble();
            System.out.println("Enter Height");
            double height = myScanner.nextDouble();
            System.out.println("\n" + "Entire area needs to be painted? (answer in y or n)");
            String check = myScanner.next();
            double area = height * width;
            if (check.equals("n") || check.equals("N")) {
                System.out.println("\n" + "How many areas don't need to be painted? ");
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
            } else {

                area = height * width;
                areatotal = areatotal + area;

            }
        }
        atotal = areatotal / bucket / coverage;
        long a = round(atotal) + 1;
        System.out.println("\n" + "\n" + "You will need  " + (a) + " buckets");
    }
}





       /* double area = (height*width)/6;
        double b=area/bucket;
        long a = round(b);

        System.out.println("You will need  " + (++a)  + " buckets");*/


    //Scanner myScanner = new Scanner(System.in);
    //System.out.println("Enter Width");
    //double width = myScanner.nextDouble();*/
     /*   System.out.println("entire area needs to be painted? (answer in y or n)");
        String check = myScanner.next();
        if(check.equals("y")) {
            System.out.println("hello");
        }
        else
            System.out.println("bye");
*/


