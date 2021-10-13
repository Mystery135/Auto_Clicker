import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class StartButtonAction implements ActionListener {

   public static boolean stopButtonPressed = false;
    @Override
    public void actionPerformed(ActionEvent e) {

stopButtonPressed = false;



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


                    if (time<0 && !stopButtonPressed){

                        timer.cancel();
                        AutoClicker clicker = new AutoClicker();
                        clicker.setDelay(delay);



                            for (int i = 0; i<clicks; i++){

                                if(!stopButtonPressed){

                                    clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);




                                }else {

                                    System.out.println("AutoClicker Stopped");
                                    Main.SuccessLabel.setText("AutoClicker Stopped!");
                                    timer.cancel();
                                    break;
                                }







                            }




                  Main.SuccessLabel.setText("AutoClicker Complete!");

System.out.println("AutoClicker Complete!");
                    }else if (stopButtonPressed){
                        System.out.println("AutoClicker Stopped");
                        Main.SuccessLabel.setText("AutoClicker Stopped!");
                        timer.cancel();

                    }
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0, 1000);



        }catch (Exception ex){


            ex.printStackTrace();
            Main.SuccessLabel.setText("AutoClicker Failed! Input Valid Numbers!");









        }




    }



}
