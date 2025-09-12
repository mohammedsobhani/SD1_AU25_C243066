/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolongword;
import java.util.Scanner;

/**
 *
 * @author moham
 */
public class TooLongWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if(word.length() > 10) {
            System.out.println(word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1));  //word.charAt(0)-> Begin  word.length() - 2->Middle Words word.length() - 1->Last word
        } else {
            System.out.println(word);
        }
    }
    
}
