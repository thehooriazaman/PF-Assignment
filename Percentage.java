import.java.util.Scanner;
 
public class Percentagemarks {
    
  public static void main (String[]args) {
    {   
    Scanner ki = new Scanner(System.in);
        System.out.println("Enter Obtained Marks:");
          double obtainedMarks = ki.nextDouble();         
    
          System.out.println("Enter Total Marks");
        double totalMarks = ki.nextDouble();
    }
        if (obtainedMarks > totalMarks) {
            System.out.println("Obtained marks cannot be greater than total marks.");
        }
    
        if (totalMarks == 0) {
            System.out.println("Maximum Marks cannot be zero.");
        } 
           {
            double percentage = obtainedMarks / totalMarks * 100;
            System.out.println("Percentage: " + percentage + "%");
          }
          ki.close();
        }
    }