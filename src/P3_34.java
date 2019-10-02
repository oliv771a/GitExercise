import java.util.Scanner;

public class P3_34
{
    public static void main(String[] args)
    {
        // Assignment P3.34
        // Initialization
        Scanner input = new Scanner(System.in);
        System.out.println("Coupon calculator");

        // Input
        System.out.println("Please enter the total amount you spent.");
        double totalAmount = input.nextDouble();

        // The discounts calculations
        double eightPercent = totalAmount * 0.08;
        double tenPercent = totalAmount * 0.1;
        double twelvePercent = totalAmount * 0.12;
        double fourteenPercent = totalAmount * 0.14;

        // Showing output to user based on their input
        if(totalAmount < 10)
        {
            System.out.println("You haven't spent enough to earn a discount coupon.");
        }
        else if(totalAmount >= 10 && totalAmount <= 60)
        {
            System.out.printf("You win a discount coupon of $%.2f", + eightPercent);
            System.out.print(" (8% of your purchase)");
        }
        else if(totalAmount >= 61 && totalAmount <= 150)
        {
            System.out.printf("You win a discount coupon of $%.2f", + tenPercent);
            System.out.print(" (10% of your purchase)");
        }
        else if(totalAmount >= 151 && totalAmount <= 210)
        {
            System.out.printf("You win a discount coupon of $%.2f", + twelvePercent);
            System.out.print(" (12% of your purchase)");
        }
        else
        {
            System.out.printf("You win a discount coupon of $%.2f", + fourteenPercent);
            System.out.print(" (14% of your purchase)");
        }


    }
}
