package codewithcaleb;

public class Main {
    public static void main(String[] args) {
        var constuctorOverload = new Employee(10_000);
        var employee = new Employee(    50_000,20);
        //how i call static or class methods
        Employee.printNumberOfEmployees();

        int wage = employee.calculateWage();
        System.out.println(wage);


    }

}
