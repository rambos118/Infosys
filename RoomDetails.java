// RoomDetails.java
public class RoomDetails implements RoomBillComponent {
    private static int counter = 101;

    private int billId;
    private String customerName;
    private String typeOfRoom;
    private int noOfExtraPersons;
    private int noOfDaysOfStay;

    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
        this.billId = counter++;
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPersons = noOfExtraPersons;
        this.noOfDaysOfStay = noOfDaysOfStay;
    }

    public int getBillId() {
        return billId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getNoOfExtraPersons() {
        return noOfExtraPersons;
    }

    public int getNoOfDaysOfStay() {
        return noOfDaysOfStay;
    }

    public boolean validateNoOfExtraPerson() {
        if (noOfExtraPersons > 2) {
            System.out.println("Error: Only 0-2 extra persons allowed per room.");
            return false;
        }
        return true;
    }

    public boolean validateTypeOfRoom() {
        if (!typeOfRoom.equals("Standard") && !typeOfRoom.equals("Deluxe") && !typeOfRoom.equals("Cottage")) {
            System.out.println("Error: Invalid room type.");
            return false;
        }
        return true;
    }

    public boolean validateNoOfDaysOfStay() {
        if (noOfDaysOfStay < 1 || noOfDaysOfStay > 15) {
            System.out.println("Error: Number of days of stay should be between 1 and 15.");
            return false;
        }
        return true;
    }

    public float calculateBill() {
        if (!validateTypeOfRoom() || !validateNoOfDaysOfStay() || !validateNoOfExtraPerson()) {
            return 0.0f;
        }

        double baseRoomFare;
        switch (typeOfRoom) {
            case "Standard":
                baseRoomFare = 2500;
                break;
            case "Deluxe":
                baseRoomFare = 3500;
                break;
            case "Cottage":
                baseRoomFare = 4500; // Assuming there is a typo in the provided table
                break;
            default:
                return 0.0f;
        }

        double totalBill = (noOfDaysOfStay * baseRoomFare) + (noOfDaysOfStay * FOOD_CHARGE) +
                (EXTRA_PERSON_CHARGE * noOfExtraPersons);

        totalBill += totalBill * TAX;

        return (float) totalBill;
    }
}
