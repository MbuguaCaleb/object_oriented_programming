package codewithcaleb;

public class Main {
    public static void main(String[] args) {
     var textBox= new TextBox();
     textBox.setText("Hello World");

     System.out.println(textBox.toString());
     //gotcha
     //the print line method automatically calls the tostring method of any object that we pass
     System.out.println(textBox);
    }

}
