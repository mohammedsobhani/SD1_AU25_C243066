/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarray;

import java.util.Arrays;

/**
 *
 * @author moham
 */
public class SortArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89};
        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
