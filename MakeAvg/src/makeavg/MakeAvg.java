package makeavg;

import java.util.Scanner;

public class MakeAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Give A: ");
        int a = scanner.nextInt();

        System.out.print("Give C: ");
        int c = scanner.nextInt();

        // Calculate average
        int b = (a + c) / 2;

        // Output result
        System.out.println("Average (B) = " + b);
    }
}