import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StopKeyListener implements KeyListener {









        @Override
        public void keyTyped(KeyEvent e) {

        }


        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();


            switch (keyCode){
                case KeyEvent.VK_SHIFT:
                case KeyEvent.VK_W:
                    StartButtonAction.stopButtonPressed = true;
                    System.out.println("Sd");
                    break;


            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

}
