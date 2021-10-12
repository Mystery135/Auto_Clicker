import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public Main(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);

    panel.setLayout(null);

    JLabel label = new JLabel("Desired Amount Of Clicks");
    label.setBounds(10,20,800,25);
    panel.add(label);


    }


public static void main(String[] args){

    new Main();






    Scanner scanner = new Scanner(System.in);
System.out.println("AutoClicker");
System.out.println("Enter the desired amount of clicks");
int clicks = scanner.nextInt();
System.out.println("Enter delay between clicks in milliseconds");
int delay = scanner.nextInt();


System.out.println("Program will start in 3 seconds");



try{

    Timer timer = new Timer();
    TimerTask timerTask =new TimerTask() {
        int time = 3;
        @Override
        public void run() {
            System.out.println(time);
            time--;


            if (time<0){

                timer.cancel();
AutoClicker clicker = new AutoClicker();
clicker.setDelay(delay);
for (int i = 0; i<clicks; i++){



    clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
}
System.out.println("AutoClicker Complete!");

            }
        }
    };
    timer.scheduleAtFixedRate(timerTask, 0, 1000);



}catch (Exception e){


    e.printStackTrace();
}



}




}
