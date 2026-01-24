package Employees;

public class parttimeEmployee implements Displayable{
    private double hourlyRate;
    private double hoursWorked;
    public parttimeEmployee(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public double getSalary() {
        return calculateSalary();
    }
    @Override
    public String getDetails() {
        return "Part-time Employee: Monthly Salary = " + getSalary();
    }
}