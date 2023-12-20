package Task2;

public class MonthlyEmployee extends Employee {

    private double salary;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String department;

    public MonthlyEmployee(double salary, String firstName, String lastName, int age, String address, String department) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    public double calculateSalary() {

        return salary;
    }

    public String toString(){
        return firstName + " " + lastName + " | Age: " + age + " | Address: " + address + " | Department: " + department + " | Salary: " + "DKK " + calculateSalary();
    }

}
