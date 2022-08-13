package codewithcaleb;

public interface TaxCalculator {

    //interfaces do not have state or data, they only have method declarations that determine what needs to be done
    float minimumTax = 3;

    double calculateTax();

}
