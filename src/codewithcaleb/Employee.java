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

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <=0 )
            throw new IllegalArgumentException("Hourly Rate Cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    //the getter is just returning
    public  int  getHourlyRate(){
        return hourlyRate;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

}
