import java.util.InputMismatchException;
import java.util.Scanner;

public class PossibleNameFinder {

    public static void main(String []args)
    {
        try 
        {
            // Initialize Scanner Class
            Scanner sc = new Scanner(System.in);

            // Initialize name variables
            String name1;
            String name2; 
            String name3;
            String possibleName1;
            String possibleName2;
            String possibleName3;
            String possibleName4;
            String possibleName5;
            String possibleName6;
            int selector; 
            char initial1;
            char initial2;

            // Asks to input the first three names
            System.out.println("Enter the three first names:");
            name1 = sc.next();
            name2 = sc.next();
            name3 = sc.next();

            // In this block Create an algorithm that checks for the input if the input is a pure string


            // Defines the names
            possibleName1 = name1 + " " + name2;
            possibleName2 = name1 + " " + name3;
            possibleName3 = name2 + " " + name1;
            possibleName4 = name2 + " " + name3;
            possibleName5 = name3 + " " + name1;
            possibleName6 = name3 + " " + name2;

            // Print the possible name combinations
            System.out.print(
                "Possible names are \n" +
                "1 - " + possibleName1 + "\n" +
                "2 - " + possibleName2 + "\n" +
                "3 - " + possibleName3 + "\n" +
                "4 - " + possibleName4 + "\n" +
                "5 - " + possibleName5 + "\n" +
                "6 - " + possibleName6 + "\n" 
            );
            
            // Selects the name
            System.out.print("Enter 1-6 select a name: ");
            selector = sc.nextInt();
            
            // Evaluates the name from 1 - 6
            if (selector == 1)
            {
                // Case 1
                initial1 = name1.charAt(0);
                initial2 = name2.charAt(0);
                System.out.println("The initials for " + possibleName1 + " is "+ initial1 + initial2 +"." );
                System.out.println("Suggested username: " + name1.toLowerCase() + "_"+ name2.toLowerCase() );
            }
            else if(selector == 2)
            {
                // Case 2
                initial1 = name1.charAt(0);
                initial2 = name3.charAt(0);
                System.out.println("The initials for " + possibleName2 + " is "+ initial1 + initial2 +"." );
                System.out.println("Suggested username: " + name1.toLowerCase() + "_"+ name3.toLowerCase() );
            }
            else if(selector == 3)
            {
                // Case 3
                initial1 = name2.charAt(0);
                initial2 = name1.charAt(0);
                System.out.println("The initials for " + possibleName3 + " is "+ initial1 + initial2 +"." );
                System.out.println("Suggested username: " + name2.toLowerCase() + "_"+ name1.toLowerCase() );
            }
            else if(selector == 4)
            {
                // Case 4
                initial1 = name2.charAt(0);
                initial2 = name3.charAt(0);
                System.out.println("The initials for " + possibleName4 + " is "+ initial1 + initial2 +"." );
                System.out.println("Suggested username: " + name2.toLowerCase() + "_"+ name3.toLowerCase() );
            }
            else if(selector == 5)
            {
                // Case 5
                initial1 = name3.charAt(0);
                initial2 = name1.charAt(0);
                System.out.println("The initials for " + possibleName5 + " is "+ initial1 + initial2 +"." );
                System.out.println("Suggested username: " + name3.toLowerCase() + "_"+ name1.toLowerCase() );
            }
            else if(selector == 6)
            {
                // Case 6
                initial1 = name3.charAt(0);
                initial2 = name2.charAt(0);
                System.out.println("The initials for " + possibleName6 + " is "+ initial1 + initial2 +"." );
                System.out.println("Suggested username: " + name3.toLowerCase() + "_"+ name2.toLowerCase() );
            }
            else{
                System.out.println("Invalid Input!!");
            }
        } catch(InputMismatchException e){
            // Catch Input Mismatch Error
            System.out.println("Invalid Input!!");
        }
    }
}