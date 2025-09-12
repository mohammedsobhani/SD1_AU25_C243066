/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchelement;

import java.util.Arrays;

/**
 *
 * @author moham
 */
public class SearchElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89};
        int key = 23;

        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(key + " found in array.");
        } else {
            System.out.println(key + " not found in array.");
        }
    }

}
