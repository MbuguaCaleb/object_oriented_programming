package codewithcaleb;

public final class CheckBox extends UIControl{

    //encapsulation is a priciple where by each class is bundled together with its methods.
    Its splitting up the classes based on their unique capability
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }

}

public class MyCheckBox extends CheckBox{

}