/* Write a program that reads in name and salary of an employee.Here the salary will denote a hourly wage, such as 9.25$.
then ask how many hours the employee worked in the past week. Be sure to accept fractional hours. Compute the pay.
Any overtime work (over 40 hours per week) is paid at 150% of the regular wage. Print paycheck for the employee.
 */

import java.util.Scanner;

public class P3_31
{
    public static void main(String[] args)
    {

        // Declaration
        Scanner in = new Scanner();

        double wagePerHour = in.nextDouble();
        double hoursPerWeek = in.nextDouble();
        double overtime = hoursPerWeek - 40 * 1.5;

    }
}
