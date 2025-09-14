package fill_water;
/**
 *
 * @author mohammed Sobhani
 */
import java.util.Scanner;
public class Fill_Water {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter B1 value: ");
        int B1 = sc.nextInt();
        System.out.println("Enter B2 value: ");
        int B2 = sc.nextInt();
        System.out.println("Enter B3 value: ");
        int B3 = sc.nextInt();
        // Count how many buckets are empty
        int emptyCount = 0;
        if (B1 == 0) 
        {
            emptyCount++;
        }
        if (B2 == 0) 
        {
            emptyCount++;
        }
        if (B3 == 0) 
        {
            emptyCount++;
        }
        if (emptyCount >= 2) 
        {
            System.out.println("Fill me up");
        } 
        else 
        {
            System.out.println("Wait");
        }
        sc.close();
    }
}
