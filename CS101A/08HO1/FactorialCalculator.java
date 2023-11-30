import java.util.Scanner;

public class FactorialCalculator 
{
    public static void main (String [] args)
    {
        // Variables
        int num;
        int reps;
        int i; 
        long factorial;

        reps = 1;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            // Initial value
            factorial = 1;
            i = 1;
            // Requires input
            System.out.println("<----- Factorial Calculator ----->");
            System.out.printf("Enter a positive integer: ");
            num = sc.nextInt();
            // Error display when number is negative
            if (num < 0)
            {
                System.out.println("Invalid input! Program Stopped!");
                break;
            }
            // Executes when number is positive
            System.out.print(num + "! = ");
            for(i = 1; i <= num; i++ )
            {
                // Computes the factorial
                factorial *= i;
                System.out.print(i);   
                if (i < num)
                {
                    System.out.print(" x " );
                }
            }
            // Displays result
            System.out.println("\nThe factorial of " + num + " is: " + factorial );
            reps++;   
        } while(reps <= 5 ); // Loops the program 5 times
    }
}
