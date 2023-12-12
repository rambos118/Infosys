import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private double salary;
    private int employeeId;

    // Parameterized constructor
    public Employee(String name, double salary, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}

// PermanentEmployee class extending Employee
class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private double variableComponent;

    // Parameterized constructor
    public PermanentEmployee(String name, double basicPay, double hra, double variableComponent, int employeeId) {
        super(name, 0, employeeId); // Salary will be calculated later
        this.basicPay = basicPay;
        this.hra = hra;
        this.variableComponent = variableComponent;
    }

    // Calculate salary method
    public void calculateSalary() {
        double salary = variableComponent + basicPay + hra;
        setSalary(salary);
    }
}

// ContractEmployee class extending Employee
class ContractEmployee extends Employee {
    private double totalHours;
    private double wages;

    // Parameterized constructor
    public ContractEmployee(String name, double totalHours, double wages, int employeeId) {
        super(name, 0, employeeId); // Salary will be calculated later
        this.totalHours = totalHours;
        this.wages = wages;
    }

    // Calculate salary method
    public void calculateSalary() {
        double salary = totalHours * wages;
        setSalary(salary);
    }
}

// EmployeeRecords class with main method
public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for PermanentEmployee
        System.out.println("Enter details for Permanent Employee:");
        System.out.print("Name: ");
        String pName = scanner.next();
        System.out.print("Basic Pay: ");
        double pBasicPay = scanner.nextDouble();
        System.out.print("HRA: ");
        double pHRA = scanner.nextDouble();
        System.out.print("Variable Component: ");
        double pVariableComponent = scanner.nextDouble();
        System.out.print("Employee ID: ");
        int pEmployeeId = scanner.nextInt();

        // Create PermanentEmployee object and calculate salary
        PermanentEmployee permanentEmployee = new PermanentEmployee(pName, pBasicPay, pHRA, pVariableComponent, pEmployeeId);
        permanentEmployee.calculateSalary();

        // Output PermanentEmployee details
        System.out.println("\nPermanent Employee Details:");
        System.out.println("Name: " + permanentEmployee.getName());
        System.out.println("Employee ID: " + permanentEmployee.getEmployeeId());
        System.out.println("Salary: " + permanentEmployee.getSalary());

        // Input for ContractEmployee
        System.out.println("\nEnter details for Contract Employee:");
        System.out.print("Name: ");
        String cName = scanner.next();
        System.out.print("Total Hours: ");
        double cTotalHours = scanner.nextDouble();
        System.out.print("Wages: ");
        double cWages = scanner.nextDouble();
        System.out.print("Employee ID: ");
        int cEmployeeId = scanner.nextInt();

        // Create ContractEmployee object and calculate salary
        ContractEmployee contractEmployee = new ContractEmployee(cName, cTotalHours, cWages, cEmployeeId);
        contractEmployee.calculateSalary();

        // Output ContractEmployee details
        System.out.println("\nContract Employee Details:");
        System.out.println("Name: " + contractEmployee.getName());
        System.out.println("Employee ID: " + contractEmployee.getEmployeeId());
        System.out.println("Salary: " + contractEmployee.getSalary());

        scanner.close();
    }
}
