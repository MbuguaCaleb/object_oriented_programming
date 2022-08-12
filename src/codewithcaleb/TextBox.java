package codewithcaleb;


public class TextBox extends UIControl{

    private String text = "";  //Fields

    //calling the constructor of the parent when there is inheritance
//    public TextBox() {
//        //super(true);
//
//    }


    @Override
    public void render() {
        System.out.println("Render Text Box");
    }

    //An annotation is a method that we attach to give more information to the Java Compiler
    @Override
    public  String toString(){
        return  text;

    }
    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }





}
