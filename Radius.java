import.java.util.scanner

public class Circlecalculation {
    public static void main(String[] args) {
        
        Scanner ki = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = ki.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        ki.close();
    }
}

