// LocationChanger.java
public class LocationChanger {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void welcomeEmployee() {
        String firstName = name.split(" ")[0];
        System.out.println("Hello " + firstName);
    }

    public void checkCity() {
        if (location.contains("Delhi")) {
            System.out.println("Welcome to Infy Mysore Delhites!");
        } else if (location.contains("Trivandrum")) {
            System.out.println("Welcome to Hyoc people of Trinfyll");
        } else if (location.contains("Bhubaneshwar")) {
            System.out.println("You came a long way down South! We welcome you!");
        } else {
            System.out.println("Oops, your city name is not listed!");
        }
    }

    public void editAddress() {
        if (location.contains("STP")) {
            System.out.println("Your location has been changed from STP to SEZ");
        } else if (location.contains("SEZ")) {
            System.out.println("Your location remains the same!");
        }
    }
}
