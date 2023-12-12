class Loan {
    private static int loanCounter = 0; // Step 1

    private int loanId;
    private double loanAmount;
    private static final double INTEREST_RATE = 0.05;

    // Default constructor
    public Loan() {
        loanId = generateLoanId(); // Step 2
        loanCounter++; // Step 2
    }

    // Parameterized constructor
    public Loan(double loanAmount) {
        this(); // Calls the default constructor
        this.loanAmount = loanAmount; // Initializes loanAmount
    }

    // Getter for loanCounter
    public static int getLoanCounter() {
        return loanCounter; // Step 1
    }

    // Getter for loanId
    public int getLoanId() {
        return loanId;
    }

    // Getter for loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Getter for INTEREST_RATE
    public static double getInterestRate() {
        return INTEREST_RATE;
    }

    // Static method to calculate interest
    public static double calculateInterest(double amount) {
        return amount * INTEREST_RATE;
    }

    // Private method to generate a unique loanId
    private int generateLoanId() {
        // Implementation to generate a unique loanId (for example, using a counter)
        return loanCounter + 1;
    }
}

public class LoanTester extends Loan {
    public static void main(String[] args) {
        // Create 2 objects of Loan class using the default and 2 using parametrized constructor.
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1000.0);
        Loan loan3 = new Loan(2000.0);

        // Use getter methods and display the value of loanCounter for every instance
        System.out.println("Loan 1 - Loan Counter: " + loan1.getLoanCounter());
        System.out.println("Loan 2 - Loan Counter: " + loan2.getLoanCounter());
        System.out.println("Loan 3 - Loan Counter: " + loan3.getLoanCounter());
    }
}
