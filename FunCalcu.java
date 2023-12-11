import java.util.Scanner;

public class FunCalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1 for Armstrong, 2 for Lucky): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number: ");
                int armstrongNumber = scanner.nextInt();
                if (isArmstrongNumber(armstrongNumber)) {
                    System.out.println("ex3.1");
                } else {
                    System.out.println("Not an Armstrong number.");
                }
                break;
            case 2:
                System.out.println("Enter the number: ");
                int luckyNumber = scanner.nextInt();
                if (isLuckyNumber(luckyNumber)) {
                    System.out.println("ex3.2");
                } else {
                    System.out.println("Not a Lucky number.");
                }
                break;
            default:
                System.out.println("ex3.3");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Function to check if a number is a Lucky number
    private static boolean isLuckyNumber(int number) {
        int squareSum = 0;
        int position = 1;

        while (number != 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                squareSum += Math.pow(digit, 2);
            }
            number /= 10;
            position++;
        }

        return squareSum % 9 == 0;
    }
}
