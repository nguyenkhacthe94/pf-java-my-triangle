import java.util.Scanner;

public class MyTriangle {
    public static boolean isValid(double side1, double side2, double side3) {
        boolean check = true;
        if ((side1+side2)<=side3 || (side2+side3)<=side1 || (side1+side3)<=side2) check = false;
        return check;
    }
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        boolean check;
        do {
        do {
            System.out.print("Enter 1st side: ");
            side1 = input.nextDouble();
            if (side1 <= 0) System.out.print("\nInvalid side");
        } while (side1 <=0);
        do {
            System.out.print("Enter 2nd side: ");
            side2 = input.nextDouble();
            if (side2 <= 0) System.out.print("\nInvalid side");
        } while (side2 <=0);
        do {
            System.out.print("Enter 3rd side: ");
            side3 = input.nextDouble();
            if (side3 <= 0) System.out.println("\nInvalid side");
        } while (side3 <=0);
        check = isValid(side1, side2, side3);
        if (check == false) System.out.println("\nInvalid side");
        } while (check == false);
        double area = area(side1, side2, side3);
        System.out.print("Area = " + area);
    }
}
