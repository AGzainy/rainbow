import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
public class rain extends JFrame{
    Rainbow p = new Rainbow();
        
        
        JButton ok = new JButton("click");
        JButton cancel = new JButton("CANCEL");
        public rain(){
            ok.setBounds(60, 400, 220, 30);
            p.setBounds(800, 800, 200, 100);
            p.add(ok);
            
            JFrame app = new JFrame();
            app.add(p);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setVisible(true);
        }
        public static void main(String[] args) {
        new rain();
    }
}