package pl.coderslab.oop.inheritance;

public class MainEmployee {
    public static void main(String[]args){

        Employee employee = new Employee(1,"Agnieszka","Doberska",3500);
        System.out.println(employee.raiseWage(35));

        HourlyEmployee hourlyEmployee = new HourlyEmployee(1,"Ola","Mazliah-Doberska", 100);
        System.out.println("per day: " + hourlyEmployee.calculatePayment(8));

        SalariedEmployee salariedEmployee = new SalariedEmployee(1,"Adam","Kowalski",20);
        System.out.println(salariedEmployee.calculatePayment());
        System.out.println(salariedEmployee.raiseWage(35));
    }
}
