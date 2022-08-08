package codewithcaleb;


//public is an access modifier
//it determines whether other classes in the package can use this class or not
//Every class in Java automatically inherits from another class
public class TextBox {
    public String text = "";  //Fields

    //function with no return value
    //it is void
    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }



}
