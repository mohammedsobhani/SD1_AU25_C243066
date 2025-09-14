package assignment;
import java.util.Scanner;
/**
 * Author: mohammed_Sobhani Purpose: Check if assignment is accepted or rejected
 * based on start time and deadline
 */
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the Starting time of the Assignment (0–23 hours) : ");
        int Start_Time = sc.nextInt();

        System.out.print("Give the Deadline of Assignment (0–23 hours) : ");
        int Dead_line = sc.nextInt();

        // Check if assignment is acceptable
        if (Start_Time <= 19) {
            if (Start_Time <= Dead_line) 
            {
                System.out.println("Your assignment is ACCEPTED");
            }
        } 
        else 
        {
            System.out.println("Your assignment is REJECTED due to delay of submission");
        }

        sc.close();
    }
}
