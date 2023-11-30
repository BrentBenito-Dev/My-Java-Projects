import java.util.*;
import java.lang.*;
import java.text.*;

public class AttackSpeedCalculator {
    public static void main(String [] args){
        // Initiate Variables
        double baseAttackSpeed;
        double bonusAttackSpeed;
        int level;
        // Scanner and Formatting
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        // Print
        System.out.printf("Enter the base attack speed: ");
        baseAttackSpeed = sc.nextDouble();
        System.out.print("Enter the bonus attack speed %: ");
        bonusAttackSpeed = sc.nextDouble();
        System.out.printf("Enter the level: ");
        level = sc.nextInt();
        // Conversion Algorithm
        double currentAttackSpeed = baseAttackSpeed * (1 + (bonusAttackSpeed / 100 * (level - 1)));
        // Final output
        System.out.printf("The character's current attack speed is " + df.format(currentAttackSpeed) +".");
       
    }
}
