package codewithcaleb;

public class Main {
    public static void main(String[] args) {
        //variables initialized from classes store the address of the class
        //They do not store the actual values no wonder they are called reference types
        var textBox1 = new  TextBox();
        var textBox2 = textBox1;

        textBox2.setText("Hello World");
        System.out.println(textBox2.text);

        //in java we do not have to worry about deallocating memory
        //When we exit a method Java will automatically remove the variables stored on the stack
        //When we initialize reference type it is different.
        //we store the value in the stack

        //garbage collector
        //removing the unused memory from the heap

    }
}
