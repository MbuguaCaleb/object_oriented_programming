package codewithcaleb;

public class Main {
    public static void main(String[] args) {
        //array of control Objects
        UIControl[] controls ={new UIControl(),new TextBox(),new CheckBox()};
        for(var control : controls)
            control.render();
    }

}
