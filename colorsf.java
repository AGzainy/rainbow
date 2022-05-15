import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class colorsf extends JFrame{
    public colorsf(){
        setSize(new Dimension(300,300));
        setLocation(100,100);
         addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
                System.exit(0);
            }
        });
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    //colory gp = new colory();
    
    //getContentPane().add(gp);
    setVisible(true);
}}