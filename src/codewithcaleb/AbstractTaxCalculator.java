package codewithcaleb;

//It is better to use and abstract class when you are sharing your logic amongst classes
//it removes the restriction of having to declare your interface
public abstract class AbstractTaxCalculator  implements TaxCalculator{

    //protected means you hide the method from outside of the package
    protected double getTaxableIncome(double income, double expenses){
        return income - expenses;
    }
}
