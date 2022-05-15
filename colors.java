import javax.swing.*;
import java.awt.*;
public class colors extends JPanel{
    public colors(Color x){
        setPreferredSize(new Dimension(200,200));
        setBackground(x);
    }
     public void paintComponent(Graphics g){
        super.paintComponent(g); }
}