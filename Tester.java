// Tester.java
public class Tester {
    public static void main(String[] args) {
        LocationChanger employee1 = new LocationChanger();
        employee1.setName("Annabelle Michael");
        employee1.setLocation("BL003, Delhi, STP");

        LocationChanger employee2 = new LocationChanger();
        employee2.setName("Jissele James");
        employee2.setLocation("FL091, Pune, SEZ");

        employee1.welcomeEmployee();
        employee1.checkCity();
        employee1.editAddress();

        System.out.println();

        employee2.welcomeEmployee();
        employee2.checkCity();
        employee2.editAddress();
    }
}
