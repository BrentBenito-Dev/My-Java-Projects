/**
    Gross Pay Calculator
    An app to compute the gross pay of an employee
    Created By: Brent Neo Benito, Alexander Castillo, and Regine Velasquez
*/


import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Variables
        String employeeName;
        double basicPay;
        double grossPay;
        double ratePerHour;
        double noOfhoursWorked;
        double noOfOvertime;
        double overtimePay;
        char employmentTypeIdentifier;

        // Ask Employee Name
        System.out.printf("Enter employee name: ");
        employeeName = sc.nextLine();

        // Ask Employment Type
        System.out.print("Press [F] for Full Time or [P] for Part Time: ");
        employmentTypeIdentifier = sc.next().charAt(0);

        try{
            // Condition
            if (employmentTypeIdentifier == 'F'|| employmentTypeIdentifier == 'f'){
                // Full Time Employee
                System.out.println("------- Full Time Employee -------");
                System.out.print("Enter Basic Pay: ");
                basicPay = sc.nextDouble();
                grossPay = basicPay;
                // Output (Full Time)
                System.out.println(
                    "______________________________________ \n" +  
                    "Employee Name:  " + employeeName + "\n" +
                    "Basic Pay:      " + basicPay + "\n" +
                    "______________________________________ \n" +
                    "Gross Pay:      " + grossPay
                );
                
            }
            else if (employmentTypeIdentifier == 'P'|| employmentTypeIdentifier == 'p'){
                // Part Time Employee
                System.out.println("------- Part Time Employee ------- ");
                System.out.print("Enter rate per hour: ");
                ratePerHour = sc.nextDouble();
                System.out.print("Enter no. of hours worked: ");
                noOfhoursWorked = sc.nextDouble();
                System.out.print("Enter no. of overtime: ");
                noOfOvertime = sc.nextDouble();
                // Pay Computation
                basicPay = ratePerHour * noOfhoursWorked;
                overtimePay = noOfOvertime* ( ratePerHour* 1.25);
                grossPay = basicPay + overtimePay;
                // Output (Part Time)
                System.out.println(
                    "_______________________________________ \n" + 
                    "Employee Name:		" +	employeeName + "\n" +
                    "Basic Pay: 		" + basicPay + "\n"+
                    "Overtime Pay:		" +	overtimePay + "\n"+
                    "_______________________________________ " + "\n"+
                    "Gross Pay:		" + grossPay);

            }
            else{
                // !Error Message!
                System.out.println("Invalid input!");
            }
        }
        catch (Exception inputMismatchException){
            System.out.println("Invalid input!");
        }
    }
}
