package exam_passed;
import java.util.Scanner;
public class Exam_Passed {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of Sections: ");
        int X=sc.nextInt();
        System.out.println("Enter the numbers of Students : ");
        int Y=sc.nextInt();
        System.out.println("Enter the numbers of Passed Students : ");
        int PassedStudent=sc.nextInt();
        int TotalPStudent=((X*Y)-PassedStudent);
        if((X*Y*0.50)>=TotalPStudent)
        {
            System.out.println("Yes 50% has passed the exam");
        }
        else
        {
            System.out.println("No, 50% of the students didn't passed");
        }
        sc.close();

    }

}
