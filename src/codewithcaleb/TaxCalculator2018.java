package codewithcaleb;

public class TaxCalculator2018 implements TaxCalculator {

    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }


    //implementation of the calculateTax method we declared in our interface
    //methods declared in my interfaces must be in my classes as well
    //As a best prectice we should add overide annotation to our interface methods
    //annotations give extra information to the java compiler.
    //it tells the java compiler that the method is the implementation of the tax interface
    @Override
    public double calculateTax(){
        return  taxableIncome * 0.4;
    }


}
