import.java.util.Scanner;

public class Originalprice {
    
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

        System.out.print("Enter discounted price: ");
        double discounted = ki.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = ki.nextDouble();

        double original = discounted / (1 - discount / 100);
        System.out.println("Original Selling Price = " + original);

        ki.close();
    }
}