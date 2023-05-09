import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ball extends JPanel {


    int x=300, y=400, bounds = 40;
    boolean move_up, move_left;
    Image image = new ImageIcon("table.jpg").getImage();
    public void Core() {

                if (x > getWidth() - 60) {
                    move_left = true;
                }
                if (x < 20) {
                    move_left = false;
                }
                // Performing horizontal motion.
                if (move_left) {
                    x -= 1;
                }
                else {
                    x += 1;
                }
                // vertical motion logic.
                if (y > getHeight() - 60) {
                    move_up = true;
                }
                if (y < 20) {
                    move_up = false;
                }
                // Performing vertical motion.
                if (move_up) {
                    y -= 1;
                }
                else {
                    y += 1;
                }
           
                repaint();
            }





    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0, size().width, size().height, null);

        g.setColor(Color.white);
        g.fillOval(x,y,bounds,bounds);

    }

}
