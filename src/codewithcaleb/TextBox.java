package codewithcaleb;


public class TextBox extends UIControl{

    private String text = "";  //Fields

    //calling the constructor of the parent when there is inheritance
    public TextBox() {
        super(true);
        //this.isEnabled;
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }



}
