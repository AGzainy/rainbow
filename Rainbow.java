import java.awt.*;
import javax.swing.*;
public class Rainbow extends JPanel{
    private final static Color VIOLET = new Color(128,0,128);
    private final static Color INDIGO = new Color(75,0,130);
    private final static Color PINK = new Color(250,130,130);
    private Color[] colors = 
    { PINK, PINK, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
        public Rainbow(){
            setBackground(PINK);
        }
        public void paintComponent(Graphics g){
            super.paintComponent ( g);
            g.setColor(Color.BLUE);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("R",150,55);
            g.setColor(Color.ORANGE);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("a",167,55);
            g.setColor(VIOLET);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("i",180,55);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("n",185,55);
            g.setColor(Color.RED);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("b",200,55);
            g.setColor(INDIGO);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("o",215,55);
            g.setColor(Color.GREEN);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("w",230,55);
            g.setColor(Color.GREEN);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("L",100,30);
            g.setColor(Color.BLUE);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("EA",115,30);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("RN",147,30);
            g.setColor(VIOLET);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("C",200,30);
            g.setColor(Color.RED);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("O",217,30);
            g.setColor(INDIGO);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("LO",235,30);
            g.setColor(Color.ORANGE);
            g.setFont(new Font("Helvetica" , Font.BOLD, 24));
            g.drawString("RS",266,30);
            int radius= 20; 
            int centrx = getWidth() /2;
            int centry = getHeight() - 10;
            for (int c = colors.length; c>0; c--){
        g.setColor(colors[c-1]);   
        g.fillArc(centrx - c*radius, centry-c*radius, c* radius *2,c* radius *2,0,180);
    }
            g.setColor(Color.BLACK);
            g.setFont(new Font("Times New Roman" , Font.BOLD, 15));
            g.drawString("Ahad Ghalib",20,260);
}}