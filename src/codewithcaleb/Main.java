package codewithcaleb;

public class Main {
    public static void main(String[] args) {

        //it is the reponsibility of another class to inject these concrete implementations
        //it increases loose coupling //and only the necessary classes will have to be recompiled
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);


        //changing dependency
        report.show(new TaxCalculator2019());


    }


}
