package codewithcaleb;

public class Main {
    public static void main(String[] args) {

     var box1 = new TextBox();
     var box2 = new TextBox();

     //Hashcode is the integer representation of an object in memory
     //System.out.println(box1.hashCode());
     //System.out.println(box2.hashCode());

    //checking objects for equality Based on the hashcode
        //System.out.println(box1.equals(box2));

        //Returns the fully qualified name of the class including the package it originates from
        //and the hashcode returned as hexadecimal
        //to string is just like the one in python
        System.out.println(box1.toString());

    }

}
