package codewithcaleb;

public class Main {
    public static void main(String[] args) {

      var control=  new UIControl(true);
      var textBox = new TextBox();

      //child has been passed into a parent class
        // Remember that the child normally has inherited all properties of the parent
      show(control);

    }

    //What i am passing in is a parent type
    public static void show(UIControl control){
        //i can upcast and downcast classes
        //for me to ise the properties of the child, i must cast it down
        if(control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("CALEB LOVES JAVA");
        }

        System.out.println(control);
    }

}
