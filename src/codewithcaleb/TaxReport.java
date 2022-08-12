package codewithcaleb;

//interfaces come to correct the issue of class dependability
//programming against interfaces helps our code become more maintainable
//our tax report does not know anything about concrete implementation
//it is only working with an interface
public class TaxReport {
    private TaxCalculator calculator;

    //brining an interface via constructor injection
    public TaxReport(TaxCalculator calculator) {
       this.calculator = calculator;
    }
    public void  show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
