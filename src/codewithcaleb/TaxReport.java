package codewithcaleb;

public class TaxReport {
    private TaxCalculator2018 calculator;

    //this is not as important in myclasses
    public TaxReport() {
       calculator = new TaxCalculator2018(100_000);
    }
    public void  show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
