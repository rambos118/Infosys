public class ReverseCalculator {
    public static void main(String[] args) {
        int number = 27;

        // Using while loop
        int reversedNumberWhile = reverseNumberWhile(number);
        System.out.println("Output(while loop):");
        System.out.println("ex2.1");
        System.out.println("Reversed Number: " + reversedNumberWhile);
        System.out.println();

        // Using for loop
        int reversedNumberFor = reverseNumberFor(number);
        System.out.println("Output(for loop):");
        System.out.println("ex2.2");
        System.out.println("Reversed Number: " + reversedNumberFor);
        System.out.println();

        // Using do-while loop
        int reversedNumberDoWhile = reverseNumberDoWhile(number);
        System.out.println("Output(do-while loop):");
        System.out.println("ex2.3");
        System.out.println("Reversed Number: " + reversedNumberDoWhile);
    }

    // Function to reverse a number using while loop
    private static int reverseNumberWhile(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Function to reverse a number using for loop
    private static int reverseNumberFor(int number) {
        int reversedNumber = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        return reversedNumber;
    }

    // Function to reverse a number using do-while loop
    private static int reverseNumberDoWhile(int number) {
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);
        return reversedNumber;
    }
}
