package codewithcaleb;

//The UI Widget
//Unlike classes in Java an interface can have multiple parents
public interface UIWidget extends Draggable, Resizable {
    void render();

}

