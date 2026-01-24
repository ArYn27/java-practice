package Employees;

public class fulltimeEmployee implements Displayable {
    private double AnnualSalary;
    public fulltimeEmployee(double annualSalary) {
        this.AnnualSalary = annualSalary;
    }
    public double calculateSalary() {
        return AnnualSalary / 12;
    }

        @Override
    public double getSalary() {
        return calculateSalary();
    }
    @Override
    public String getDetails() {
        return "Full-time Employee: Monthly Salary = " + getSalary();
    }
}
