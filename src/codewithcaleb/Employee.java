package codewithcaleb;

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    //getters and setters
    public  void setBaseSalary(int baseSalary){
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <=0 )
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

}
