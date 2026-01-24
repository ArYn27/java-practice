// File: SalaryDisplay.java
package Employees;

public class SalaryDisplay {
    
    // Helper method that works with ANY object that implements Displayable
    public static void printSalary(Displayable employee) {
        double salary = employee.getSalary();
        String description = employee.getDetails();
        
        System.out.printf("%-25s : $%.2f%n", description, salary);
    }

    public static void main(String[] args) {
        System.out.println("=== Salary Report ===");
        
        // Full-time example
        Displayable fullTime = new fulltimeEmployee(72000);
        printSalary(fullTime);

        // Part-time example
        Displayable partTime = new parttimeEmployee(22.50, 68);
        printSalary(partTime);

        System.out.println("====================");
    }
}