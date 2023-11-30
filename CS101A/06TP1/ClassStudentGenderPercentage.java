import java.lang.*;
import java.util.*;
import java.text.*;

public class ClassStudentGenderPercentage {
    public static void main(String [] args){
        // Variables
        int noOfMales;
        int noOfFemales;
        int noOfStudents;
        double malePercentage;
        double femalePercentage;
        // Scanner and Format
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        // Ask the number fo
        System.out.printf("Enter the number of males: ");
        noOfMales = sc.nextInt();
        System.out.printf("Enter the number of females: ");
        noOfFemales = sc.nextInt();
        // Total and Percentage
        noOfStudents = noOfMales + noOfFemales;
        double x = noOfMales;
        double y = noOfFemales;
        double z = noOfStudents;
        malePercentage = (x / z) * 100;
        femalePercentage = (y / z) * 100;
        System.out.println("Number of students = " + noOfStudents);
        System.out.println("Male =  " + df.format(malePercentage) + "%");
        System.out.println("Female =  " + df.format(femalePercentage) + "%");
    }
}
