import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopButtonAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        StartButtonAction.stopButtonPressed = true;
    }
}
