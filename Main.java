// Main.java
public class Main {
    public static void main(String[] args) {
        // Example usage for Intern
        Intern intern1 = new Intern(5000, 500);
        System.out.println("Intern 1: The total aggregate percentage secured is " + intern1.calcPercentage());

        Intern intern2 = new Intern(8000, 500);
        System.out.println("Intern 2: The total aggregate percentage secured is " + intern2.calcPercentage());

        // Example usage for Trainee
        Trainee trainee = new Trainee(6000);
        System.out.println("Trainee: The total aggregate percentage secured is " + trainee.calcPercentage());
    }
}
