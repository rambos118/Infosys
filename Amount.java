public class Amount {
    public static void main(String[] args) {
        // Input 1
        int billId1 = 1001;
        int customerId1 = 101;
        double discount1 = 2.0; // Representing percentage
        double billAmount1 = 199.99;

        // Calculate discounted bill amount for Input 1
        double discountedBillAmount1 = calculateDiscountedBillAmount(billAmount1, discount1);

        // Print details for Input 1
        printBillDetails(billId1, customerId1, discountedBillAmount1);

        // Input 2
        int billId2 = 1002;
        int customerId2 = 102;
        double discount2 = 4.0; // Representing percentage
        double billAmount2 = 210.5;

        // Calculate discounted bill amount for Input 2
        double discountedBillAmount2 = calculateDiscountedBillAmount(billAmount2, discount2);

        // Print details for Input 2
        printBillDetails(billId2, customerId2, discountedBillAmount2);
    }

    // Function to calculate discounted bill amount
    private static double calculateDiscountedBillAmount(double billAmount, double discount) {
        return billAmount - billAmount * (discount / 100);
    }

    // Function to print bill details
    private static void printBillDetails(int billId, int customerId, double discountedBillAmount) {
        System.out.println("Bill ID: " + billId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Discounted Bill Amount: $" + discountedBillAmount);
        System.out.println("------------------------------");
    }
}
