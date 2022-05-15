import javax.swing.*;
import java.awt.*;
public class shapes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g); //overridden to paint component in super class JPanel
        g.setColor(Color.BLACK);
        g.drawLine(100,100,200,150);}}