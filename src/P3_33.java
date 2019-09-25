import java.util.Scanner;

public class P3_33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double price = 0, tip = 0;
        int satisfaction = 0;

        System.out.println("Please enter the total meal cost:");
        if (scanner.hasNextDouble()) price = scanner.nextDouble();
        else System.out.println("Please enter a valid number, in the form x.x");

        System.out.println("How satisfied are you with the service?");
        System.out.println("From 1 to 3, 1 being satisfied while 3 is dissatisfied.");

        while (scanner.hasNextInt()) {

            satisfaction = scanner.nextInt();
            if (satisfaction <= 3 && satisfaction >= 1) break;
            else System.out.println("Please enter in a number between 1 and 3.");

        }

        switch(satisfaction) {
            case 1:
                tip = price * 0.2;
                break;
            case 2:
                tip = price * 0.15;
                break;
            case 3:
                tip = price * 0.1;
                break;
        }

        System.out.println("The total tip to be given is $" + tip);
        System.out.println("The value was based on the satisfactory level " + satisfaction);
    }
}
