import.java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
   
        Scanner ki = new Scanner(System.in);

        System.out.println("Enter side a: ");
        double a = ki.nextDouble();
      
        System.out.println("Enter side b: ");
        double b = ki.nextDouble();
      
        System.out.println("Enter side c: ");
        double c = ki.nextDouble();
      
        double s = (a + b + c) / 2;
        double area = math.sqrt (s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle = " + area);

        ki.close();
    }
}