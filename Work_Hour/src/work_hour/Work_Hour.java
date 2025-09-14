package work_hour;
import java.util.Scanner;
/**
 *
 * @author moham
 */
public class Work_Hour {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours of each day: ");
        int X=sc.nextInt();
        System.out.println("Enter the total working days: ");
        int Z=sc.nextInt();
        System.out.println("Enter Chill day (Wednesday) working hour: ");
        int Y=sc.nextInt();
        if(Y<X)
        {
            int T_W_H=((X*4)+Y);
            System.out.println("Total working hour in a working week: "+T_W_H+" hours");
        }
        sc.close();
    }
}
