import.java.util.Scanner;

public class Powercalculation {
    
    public static void main(String[] args) {
    
        Scanner ki = new Scanner(System.in);

        System.out.println("Enter voltage (Volts): ");
        double volts = ki.nextDouble();

        System.out.println("Enter current (Amperes): ");
        double amperes = ki.nextDouble();

        double watts = volts * amperes;
        System.out.println("Power Consumption = " + watts + " Watts");

        ki.close();
    }
}