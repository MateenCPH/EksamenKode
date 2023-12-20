package Task2;

public class HourlyEmployee extends Employee {
    private double numberOfHours;
    private double payPerHour;
    private double salary;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String department;

    public HourlyEmployee(double numberOfHours, double payPerHour, String firstName, String lastName, int age, String address, String department) {
        this.numberOfHours = numberOfHours;
        this.payPerHour = payPerHour;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    public double calculateSalary() {
        return salary = numberOfHours * payPerHour;
    }


    public String toString() {
        return firstName + " " + lastName + " | Age: " + age + " | Address: " + address + " | Department: " + department + " | Salary: " + "DKK " + calculateSalary();
    }
}
