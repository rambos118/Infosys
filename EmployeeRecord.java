public class EmployeeRecord {
    public static void main(String[] args) {
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Calculate average salary
        double averageSalary = calculateAverage(salaries);

        // Count employees with salary greater than and lesser than average
        int aboveAverageCount = countAboveAverage(salaries, averageSalary);
        int belowAverageCount = countBelowAverage(salaries, averageSalary);

        // Display results
        System.out.println("Average Salary: $" + averageSalary);
        System.out.println("Number of employees with salary above average: " + aboveAverageCount);
        System.out.println("Number of employees with salary below average: " + belowAverageCount);
    }

    // Function to calculate the average salary
    private static double calculateAverage(double[] salaries) {
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        return sum / salaries.length;
    }

    // Function to count employees with salary above the average
    private static int countAboveAverage(double[] salaries, double averageSalary) {
        int count = 0;
        for (double salary : salaries) {
            if (salary > averageSalary) {
                count++;
            }
        }
        return count;
    }

    // Function to count employees with salary below the average
    private static int countBelowAverage(double[] salaries, double averageSalary) {
        int count = 0;
        for (double salary : salaries) {
            if (salary < averageSalary) {
                count++;
            }
        }
        return count;
    }
}
