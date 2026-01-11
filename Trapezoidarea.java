import.java.util.Scanner;

    public class Trapezoidarea {
        
        public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

        System.out.println("Enter length of first parallel side (a): ");
        double a = ki.nextDouble();

        System.out.println("Enter length of second parallel side (b): ");
        double b = ki.nextDouble();

        System.out.println("Enter height (h): ");
        double h = ki.nextDouble();

        double area = h * (a + b) / 2;

        System.out.println("Area of Trapezoid = " + area);

        ki.close();
    }
}