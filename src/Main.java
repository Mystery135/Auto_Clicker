import javax.swing.*;
import java.awt.*;

public class Main{
      static JLabel AmountOfClicksLabel;
     static JLabel TimeBetweenClicksLabel;
    static JLabel SuccessLabel;
     static JTextField TimeBetweenClicksInput;
      static JTextField AmountOfClicksInput;
     static JButton startButton;
    static JButton stopButton;
    public Main(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
    frame.setSize(500,500);


    panel.setLayout(null);

    AmountOfClicksLabel = new JLabel("Desired Amount Of Clicks");
    AmountOfClicksLabel.setBounds(10,20,800,25);
    AmountOfClicksInput = new JTextField(200);
AmountOfClicksInput.setBounds(10,50,165,25);

TimeBetweenClicksLabel = new JLabel("Time Between Clicks (in milliseconds)");
TimeBetweenClicksLabel.setBounds(10,100,800,25);

    TimeBetweenClicksInput = new JTextField(200);
        TimeBetweenClicksInput.setBounds(10,130,165,25);

        startButton = new JButton("Start!");
        startButton.addActionListener(new StartButtonAction());
        startButton.setBounds(10,170,80,25);

        stopButton = new JButton("Stop!");
        stopButton.addActionListener(new StopButtonAction());
        stopButton.setBounds(90,170,80,25);
        stopButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
SuccessLabel = new JLabel("");
SuccessLabel.setBounds(10,220,800,25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        frame.addKeyListener(new StopKeyListener());
        panel.addKeyListener(new StopKeyListener());



        panel.add(SuccessLabel);
        panel.add(startButton);
        panel.add(TimeBetweenClicksLabel);
        panel.add(AmountOfClicksInput);
        panel.add(TimeBetweenClicksInput);
        panel.add(stopButton);

    panel.add(AmountOfClicksLabel);


















    }






    public static void main(String[] args) {

    new Main();


}




}




