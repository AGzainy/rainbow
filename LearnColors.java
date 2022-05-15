import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*; 
   public class LearnColors
   { 
      public static void main(String[] args)
      {
   	 JFrame f = new JFrame("Border Layout");
          f.setBounds(900,900,900,900);
        
   	 JPanel MyPanel1 = new JPanel();
    
   	 MyPanel1.setLayout( new BorderLayout() );
         Rainbow p = new Rainbow();
         MyPanel1.add(p);
   	 f.getContentPane().add( MyPanel1, "North");
   	 JPanel MyPanel2 = new JPanel();
   	 
   	 MyPanel2.setLayout( new BorderLayout() );
    
   	 JButton x6 = new JButton("yellow");
   	 JButton x7 = new JButton("Red");
   	 JButton x8 = new JButton("Blue");
   	 JButton x9 = new JButton("Green");
   	 JButton x10 = new JButton("Orange");
    
   	 MyPanel2.add(x6, "North");
   	 MyPanel2.add(x7, "South");
   	 MyPanel2.add(x8, "East");
   	 MyPanel2.add(x9, "West");
   	 MyPanel2.add(x10, "Center");
   	 
   	 x6l lsn6= new x6l();
         x7l lsn7 = new x7l();
         x8l lsn8 = new x8l();
         x9l lsn9 = new x9l();
         x10l lsn10 = new x10l();
         
         x6.addActionListener(lsn6);
         x7.addActionListener(lsn7);
         x8.addActionListener(lsn8);
         x9.addActionListener(lsn9);
         x10.addActionListener(lsn10);
         
   	 f.getContentPane().add( MyPanel2, "South");   
         f.getContentPane().add(MyPanel1, "Center");     
    
   	 f.setSize(400, 370);
   	 f.setVisible(true);
      }
   }
   class x6l implements ActionListener{
public void actionPerformed(ActionEvent e){
new yellow();}}
class x7l implements ActionListener{
  public void actionPerformed(ActionEvent e){
   new Red();}}
class x8l implements ActionListener{
  public void actionPerformed(ActionEvent e){
   new Blue();}}
class x9l implements ActionListener{
  public void actionPerformed(ActionEvent e){
   new Green();}}
class x10l implements ActionListener{
  public void actionPerformed(ActionEvent e){
   new Orange();}}