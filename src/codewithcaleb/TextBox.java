package codewithcaleb;



public class TextBox extends UIControl{
    private String text = "";  //Fields

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }



}
