package codewithcaleb;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    //because of encapsulation we do not have to pass the fields as method params
    //in procedural we would have has three params
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
