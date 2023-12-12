public class PerformanceCalculator {
    public static void main(String[] args) {
        // Create 3 employee objects
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        // Set their points
        employee1.setPoint(90);
        employee2.setPoint(65);
        employee3.setPoint(40);

        // Calculate and print their performance ratings
        int rating1 = PerformanceRating.calculatePerformance(employee1);
        int rating2 = PerformanceRating.calculatePerformance(employee2);
        int rating3 = PerformanceRating.calculatePerformance(employee3);

        // Display performance ratings
        displayPerformance(employee1, rating1);
        displayPerformance(employee2, rating2);
        displayPerformance(employee3, rating3);
    }

    // Nested Employee class
    static class Employee {
        private int point;

        // Getter method for point
        public int getPoint() {
            return point;
        }

        // Setter method for point
        public void setPoint(int point) {
            this.point = point;
        }
    }

    // PerformanceRating class remains unchanged
    static class PerformanceRating {
        private static final int OUTSTANDING = 5;
        private static final int GOOD = 4;
        private static final int AVERAGE = 3;
        private static final int POOR = 2;

        // Static method to calculate performance
        public static int calculatePerformance(Employee employee) {
            int point = employee.getPoint();

            if (point >= 80 && point <= 100) {
                return OUTSTANDING;
            } else if (point >= 60 && point <= 79) {
                return GOOD;
            } else if (point >= 50 && point <= 59) {
                return AVERAGE;
            } else if (point >= 1 && point <= 49) {
                return POOR;
            } else {
                // Handle the case where the point is not in the specified range
                return -1;
            }
        }
    }

    // Helper method to display performance rating
    private static void displayPerformance(Employee employee, int rating) {
        System.out.println("Employee with point " + employee.getPoint() + " has a performance rating of: ");

        switch (rating) {
            case 5:
                System.out.println("Outstanding");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 2:
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid rating");
                break;
        }
    }
}
