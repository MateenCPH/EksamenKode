package Task2;

public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double sale;
    private double commissionPercentage;
    private double salary;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String department;

    public CommissionEmployee(double baseSalary, double sale, double commissionPercentage, String firstName, String lastName, int age, String address, String department) {
        this.baseSalary = baseSalary;
        this.sale = sale;
        this.commissionPercentage = commissionPercentage;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    public double calculateSalary() {
        return salary = baseSalary + ((commissionPercentage / 100) * sale);
    }

    public String toString(){
        return firstName + " " + lastName + " | Age: " + age + " | Address: " + address + " | Department: " + department + " | Salary: " + "DKK " + calculateSalary();
    }
}
