package codewithcaleb;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // a constructos hould have exactly the same name as the name of the class
//    public Employee(int baseSalary){
//       setBaseSalary(baseSalary);
//       setHourlyRate(0);
//    }

    //reusing constructor

    //recalling constuctor with overloading
    public Employee(int baseSalary){
         this(baseSalary,0);
         }

    public Employee(int baseSalary,int hourlyRate){
       setBaseSalary(baseSalary);
       setHourlyRate(hourlyRate);
    }

    //getters and setters
    private void setBaseSalary(int baseSalary){
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0 )
            throw new IllegalArgumentException("Hourly Rate Cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    //the getter is just returning
    //By making a method private i am abstacting it(i.e making it only available to the specific class)
    private  int  getHourlyRate(){
        return hourlyRate;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0);
    }

}
