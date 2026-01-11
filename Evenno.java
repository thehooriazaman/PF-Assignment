import.java.util.Scanner;

public class Evenodd {
     
    public static void main (String[]args) {
    
        Scanner ki = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = ki.nextInt();
    
        if (number % 2 == 0) {
            System.out.println( " is an Even number.");
    
        } else {
            System.out.println( " is an Odd number.");
        }
       
        ki.close();
      }
    }