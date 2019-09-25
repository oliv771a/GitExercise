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

        // TODO Need to make the if statements and the outputs



    }
}
