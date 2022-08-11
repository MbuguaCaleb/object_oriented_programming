package codewithcaleb;

public class Main {
    public static void main(String[] args) {

     var point1 = new Point(1,2);
     var point2 = new Point(1,2);

     //for reference types the values that are stored in variables are the values of the address of the
        // objects in memroy
//     System.out.println(point1 ==point2);
//
//     System.out.println(point1.equals(point1));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());


    }



}
