import java.awt.*;

public class AutoClicker {
    private Robot robot;
    private int delay; // delay between clicks in ms
public AutoClicker(){
    try{

        robot = new Robot();
    }catch (Exception e){

        e.printStackTrace();

    }
   delay = 300;


}

public void clickMouse(int button){
    try {
        robot.mousePress(button);
        robot.delay(250);//sleep for x milliseconds
        robot.mouseRelease(button);
        robot.delay(delay);

    }catch (Exception e){
        e.printStackTrace();

    }


}

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
