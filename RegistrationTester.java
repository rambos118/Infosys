class Registration {
    String customerName;
    String passportNumber;
    String licenseNumber;
    String panCardNumber;
    String voterId;
    String[] phoneNumbers;

    // Constructor for Passport and Phone Numbers
    public Registration(String customerName, String passportNumber, String phoneNumber1, String phoneNumber2) {
        this.customerName = customerName;
        this.passportNumber = passportNumber;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Constructor for License, Pan Card Numbers, and Phone Numbers
    public Registration(String customerName, String licenseNumber, String panCardNumber, String phoneNumber1, String phoneNumber2) {
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.panCardNumber = panCardNumber;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Constructor for Voter Id, License Number, and Phone Numbers
    public Registration(String customerName, String voterId, String licenseNumber, String panCardNumber, String phoneNumber1, String phoneNumber2) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNumber = licenseNumber;
        this.panCardNumber = panCardNumber;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Display registration details
    public void displayRegistrationDetails() {
        System.out.println("Congratulations " + customerName + "!!! you have been successfully registered for our services with the following details:");

        if (passportNumber != null) {
            System.out.println("Passport number: " + passportNumber);
        } else {
            System.out.println("License number: " + licenseNumber);
            System.out.println("Pan card number: " + panCardNumber);
        }

        if (voterId != null) {
            System.out.println("Voter id: " + voterId);
        }

        System.out.println("Phone numbers: " + phoneNumbers[0]);
        System.out.println(phoneNumbers[1]);
    }
}

public class RegistrationTester {
    public static void main(String[] args) {
        // Test cases
        Registration user1 = new Registration("Kevin", "MN9891N", "9452425421", "7676765252");
        user1.displayRegistrationDetails();

        System.out.println(); // Add a newline for better readability

        Registration user2 = new Registration("Julias", "123", "PN7878", "2345615451", "6763562562");
        user2.displayRegistrationDetails();

        System.out.println(); // Add a newline for better readability

        Registration user3 = new Registration("Jammy", "45453", "765", "9634524353", "9887373737");
        user3.displayRegistrationDetails();

        System.out.println(); // Add a newline for better readability

        Registration user4 = new Registration("Rose", "PN8934", "34356", "9867456367", "7645367356");
        user4.displayRegistrationDetails();
    }
}
