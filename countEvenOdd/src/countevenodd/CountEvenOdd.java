/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countevenodd;

import java.util.Arrays;

/**
 *
 * @author moham
 */
public class CountEvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

}
