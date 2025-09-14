/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;

/**
 *
 * @author moham
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "SOBHBOS"; //SOBHANI theke example SOBHOS
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

}

