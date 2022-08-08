package codewithcaleb;

public class Main {
    public static void main(String[] args) {
        //Instantiating the class
        //TextBox textBox1 = new TextBox();

        //Better syntax when instantiating Java Class
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());


        var textBox2 = new TextBox();
        textBox2.setText("Box Two");
        System.out.println(textBox2.text);


    }
}
