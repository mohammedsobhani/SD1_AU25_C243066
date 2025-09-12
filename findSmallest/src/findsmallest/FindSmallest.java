/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsmallest;

import java.util.Arrays;

/**
 *
 * @author moham
 */
public class FindSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest: " + min);
    }

}
