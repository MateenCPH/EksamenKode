package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new MonthlyEmployee (30000, "Peter","Larsen", 21,"Istedgade 80","HR"));
        employees.add(new MonthlyEmployee(65000,"Jens","Christensen",32,"Hellerupvej 9","IT"));

        employees.add(new HourlyEmployee(148,230,"Marcus","Hjort",20,"Trekronervej 21","IT-Systemudvikling"));
        employees.add(new HourlyEmployee(150,190,"Rodney","Muyanga",27,"Amagerbrogade 17","IT-Webadministration"));

        employees.add(new CommissionEmployee(20000, 79325, 18,"Rebecca","Sørensen",25,"Østerbrogade 28","IT-Sales"));
        employees.add(new CommissionEmployee(20000,81275,18,"Mateen","Rafiq",22,"Spaden B6","IT-Service"));

        for (Employee employee : employees){
            System.out.println(employee);
        }


    }

}
