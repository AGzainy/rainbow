import javax.swing.*;
import java.awt.event.*;
class rainbowEvent extends JFrame{
 public rainbowEvent(){
     //create two buttons
     JButton ok = new JButton("OK");
     JButton cancel = new JButton("CANCEL");
      //create a panel to hold the buttons
     JPanel pnl = new JPanel();
     pnl.add(ok);
     pnl.add(cancel);
     add(pnl); //adding panel to the frame*/
     //register listeners
    OKListenerClass lsn1=new OKListenerClass();
     CancelListenerClass lsn2 = new CancelListenerClass();
     ok.addActionListener(lsn1);
     cancel.addActionListener(lsn2);
    }
    }
class OKListenerClass implements ActionListener{
//override
public void actionPerformed(ActionEvent e){
System.out.println("OK button Clicked");
}
}
class CancelListenerClass implements ActionListener{
  //orerride
  public void actionPerformed(ActionEvent e){
   System.out.println("Cancel button Clicked");   
}
    
    
}
