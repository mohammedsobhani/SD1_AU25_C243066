/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalization;

import java.util.Scanner;

/**
 *
 * @author moham
 */
public class Capitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
    }

}
