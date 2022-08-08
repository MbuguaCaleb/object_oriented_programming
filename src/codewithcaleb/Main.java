package codewithcaleb;

public class Main {
    public static void main(String[] args) {

        //procedural programming refactored
        //Programme to calculate the wage of our employees
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary,extraHours,hourlyRate);
        System.out.println(wage);
    }

    //method2 declared as static so that we can easily call it from the other method
    //the main problem with functional programming is code maintainability
    //It is better to have my class with my methods which i can then use universally
    //Another disadvantage of writing code with procedural style is that you end up with methods that have so many parameters//
    //If you have methods with more than 5 params you are not using OOP(We end up with waht we call fat methods or fat classes...
    //Chaining vey many methods in the same class with repeated parameters is sphagetti code
    public static int calculateWage (int baseSalary,
                                     int extraHours,
                                     int hourlyRate){
        return  baseSalary + (extraHours * hourlyRate);
    }
}
