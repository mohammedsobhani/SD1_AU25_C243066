package javacodes;

import java.util.Scanner;  // Import Scanner class

public class JavaCodes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your mark: ");
        int mark = input.nextInt();  // Read integer input

        if (mark >= 80) {
            System.out.println("Grade A+");
        } else if (mark >= 70) {
            System.out.println("Grade A");
        } else if(mark>=50){
            System.out.println("Sill Need Improvement");
        }
        else if(mark>=40)
        {
            System.out.println("Haha Improvement is Compulsory");
        }
        else
        {
            System.out.println("Failed you dumb");
        }

        input.close(); // Always good to close scanner
    }
}
