import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ButtonAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {












        int clicks = Integer.parseInt( Main.AmountOfClicksInput.getText());

        int delay = Integer.parseInt( Main.TimeBetweenClicksInput.getText());


        System.out.println("Program will start in 3 seconds");
        Main.SuccessLabel.setText("Program will start in 3 seconds");


        try{

            Timer timer = new Timer();
            TimerTask timerTask =new TimerTask() {
                int time = 3;
                @Override
                public void run() {
                    System.out.println(time);
                    Main.SuccessLabel.setText("Auto Clicker Starting In "+ (time));
                    time--;


                    if (time<0){

                        timer.cancel();
                        AutoClicker clicker = new AutoClicker();
                        clicker.setDelay(delay);
                        for (int i = 0; i<clicks; i++){



                            clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
                        }

                  Main.SuccessLabel.setText("AutoClicker Complete!");

System.out.println("AutoClicker Complete!");
                    }
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0, 1000);



        }catch (Exception ex){


            ex.printStackTrace();
        }




    }
}
