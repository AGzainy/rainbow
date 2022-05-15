import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
public class drawRainbowTest {
    public static void main (String [] args){
        JFrame app = new JFrame();
        Rainbow p = new Rainbow();
        //p.setLayout( new BorderLayout() );
        //JLayeredPane ag = new JLayeredPane();
        //ag.setPreferredSize(new Dimension(800,500));
        
        JButton ok = new JButton("click");
        JButton cancel = new JButton("CANCEL");
     
        OKListenerClass lsn1=new OKListenerClass();
        CancelListenerClass lsn2 = new CancelListenerClass();
        ok.addActionListener(lsn1);
        cancel.addActionListener(lsn2);
        
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shapes sh=new shapes();
        //JPanel a = new JPanel();
        //a.add(ok);
        /*a.setSize(5,5);
        a.setLocation(500,200);*/
        //ok.setBounds(38000,100,200,200);
        
        app.setBounds(1000,500,400,300);
        
        p.add(ok,"North");
        p.add(cancel,"North");
        
        //p.add(sh);
        //ok.setLocation(50,300);
         app.add(p);
        app.setVisible(true);
        
    }
}
class OKListenerClass implements ActionListener{
//override
public void actionPerformed(ActionEvent e){
System.out.println("this color is red");
}
}
class CancelListenerClass implements ActionListener{
  //orerride
  public void actionPerformed(ActionEvent e){
   System.out.println("Cancel button Clicked");   
}
    
    
}