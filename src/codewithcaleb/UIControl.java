package codewithcaleb;

public abstract class UIControl  {
   private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//       this.isEnabled = isEnabled;
//       System.out.println("UIControl");
//    }

    //method for rendering control Objects
    public abstract void render();
    public  final void enable(){
        isEnabled =true;
    }

    public void disable(){
        isEnabled = false;
    }

    //getter
    public boolean isEnabled(){
        return isEnabled;
    }
}
