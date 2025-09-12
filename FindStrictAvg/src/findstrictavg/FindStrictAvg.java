/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findstrictavg;
import java.util.Scanner;
/**
 *
 * @author moham
 */
public class FindStrictAvg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A=sc.nextInt();
        System.out.println("Enter the value of B:");
        int B=sc.nextInt();
        System.out.println("Enter the value of C:");
        int C=sc.nextInt();
        int D=(A+B)/2;
        int E=(B+C)/2;
        if(D>E)
        {
            System.out.println("A & B's AVG is greater");
        }
        else
        {
            System.out.println("B & C's AVG is greater");
        }
    }
    
}
