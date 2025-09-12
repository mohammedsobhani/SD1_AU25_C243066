package switch_case;
import java.util.Scanner;
/**
 *
 * @author Syed Mohammed Sobhani
 */
public class Switch_Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = input.nextInt();

        switch (mark / 10) {
            case 10: // For 100
            case 9:  // For 90–99
            case 8:  // For 80–89
                System.out.println("Grade A+");
                break;

            case 7:  // For 70–79
                System.out.println("Grade A");
                break;

            case 6:  // For 60–69
                System.out.println("Grade B");
                break;

            case 5:  // For 50–59
                System.out.println("Grade C");
                break;

            default: // For less than 50
                System.out.println("Need Improvement");
        }

        input.close();
    }
    }



