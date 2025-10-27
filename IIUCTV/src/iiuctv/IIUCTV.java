/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiuctv;

import java.util.Scanner;

/**
 *
 * @author moham
 */
public class IIUCTV {

    /**
     * @param args the command line arguments
     */
    public static int calculateMinimumCost(int N, int X) {
        // Each subscription can be shared by 6 people
        int subscriptionsNeeded = (N + 5) / 6;  // Round up division
        return subscriptionsNeeded * X;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of friends (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter cost per subscription (X): ");
        int X = scanner.nextInt();

        int totalCost = calculateMinimumCost(N, X);
        System.out.println("Minimum total cost: " + totalCost + " Taka");
    }
}
