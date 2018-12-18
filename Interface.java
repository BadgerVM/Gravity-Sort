 package gravity.sort;

import static gravity.sort.GravitySort.grid;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class Interface extends JPanel implements ActionListener{

   
   Timer t = new Timer (100, this);
       
   @Override
   public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i< grid.length; i++){
            for (int j = 0; j< grid[1].length; j++){
                if (grid[i][j] == true){
                    Ellipse2D circle = new Ellipse2D.Double(i*10, j*10,10,10);
                    g2.fill(circle);
                }                
            }
        }
        t.start();
   } 
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
    
    
}
