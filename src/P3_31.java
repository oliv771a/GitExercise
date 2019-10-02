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
        Scanner in = new Scanner(System.in);

        String employeeName = "";
        double wagePerHour = 0;
        double hoursPerWeek = 0;
        double salary = 0;

        //Input validation
        System.out.println("Please enter in the employee name:");
        employeeName = in.next();

        System.out.println("Please enter in " + employeeName + "'s hourly wage in $:");
        boolean confirmedInput = false;
        while(!confirmedInput){
            if(in.hasNextDouble()){
                wagePerHour = in.nextDouble();

                if(wagePerHour > 0) confirmedInput = true;
                else System.out.println("Please enter in a valid salary larger than 0");
            }else{
                System.out.println("Please enter in a valid salary, example: 9.25");
            }
        }

        System.out.println("How many hours did " + employeeName + " work in the past week?");
        confirmedInput = false;
        while(!confirmedInput){
            if(in.hasNextDouble()){
                hoursPerWeek = in.nextDouble();

                if(hoursPerWeek > 0) confirmedInput = true;
                else System.out.println("Please enter in a an amount of hours higher than 0");
            }else{
                System.out.println("Please enter in a amount of hours, example: 9.25");
            }
        }

        //Computation
        if(hoursPerWeek <= 40){
            salary = hoursPerWeek * wagePerHour;
        }else{
            double overtime = hoursPerWeek - 40;
            salary = (40 * wagePerHour) + (overtime * (wagePerHour * 1.5));
        }

        //Output
        System.out.println(employeeName + " has worked a total of " + hoursPerWeek + " hours this week.");
        System.out.println("Their hourly wage is $" + wagePerHour + " which results in salary of $" + salary);
=======


>>>>>>> 01901ff677a2b2abaa27577b186568eea24795a2
    }
}
