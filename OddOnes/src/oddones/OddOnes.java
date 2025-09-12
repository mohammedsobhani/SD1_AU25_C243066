/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddones;

/**
 *
 * @author moham
 */
public class OddOnes {

    /**
     * @param args the command line arguments
     */
    public static int findOddOne(int a, int b, int c) {
        if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        // Example inputs
        int a = 4, b = 4, c = 7;

        int oddOne = findOddOne(a, b, c);
        System.out.println("The value that occurs exactly once is: " + oddOne);
    }
}

}
