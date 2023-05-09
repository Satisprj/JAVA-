import javax.swing.*;
import java.awt.*;

public class Graphics {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    Ball ball = new Ball();
    void forframe() throws InterruptedException {
        Container c = frame.getContentPane();
        Ball ball = new Ball();
        frame.setSize(600,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(ball);

//        Container c = frame.getContentPane();
//
//        label.setIcon(new ImageIcon("glowhocky.png"));
//        Dimension size = label.getPreferredSize(); //Gets the size of the image
//        label.setBounds(1000, 30, size.width, size.height);
//
//        frame.add(label);
frame.setVisible(true);
        while (true){
            ball.Core();
            Thread.sleep(10);
        }


    }


}
