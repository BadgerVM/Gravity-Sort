
package gravity.sort;
import static java.lang.Thread.sleep;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFrame;



public class GravitySort {
        public static boolean  [][] grid;
	static final int MAX_VALUE = 50; 
    
    public static void main(String[] args) throws InterruptedException {
        grid = new boolean [MAX_VALUE][MAX_VALUE];
        
        for (int i = 0; i < grid.length; i++) {
                int value = ThreadLocalRandom.current().nextInt(1,MAX_VALUE+1);
                setNumber (i,value);
                
        }
        
        Interface s = new Interface();
        JFrame f = new JFrame();
        f.add(s);
        f.setVisible(true);
        f.setSize((grid.length*11),(grid[0].length*11));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Gravity Sort");
        sleep(500);
        for (int i = 0; i < MAX_VALUE; i++){
            sleep(100);
            iteration();
        }
           
    }
    
 
    public static void iteration(){
        for (int i = grid[0].length-1; i >= 0; i--){
            for (int j = grid.length-1; j > 0; j--){
                if (!grid[j][i]){
                    boolean temp = grid [j][i];
                    grid[j][i] = grid[j-1][i];
                    grid[j-1][i] = temp;
                }        
            }
        }
    }
    
    public static void setNumber (int index, int value){
        int z = grid[1].length;
        for (int i = 0; i < grid[index].length; i++){
            if (i < value){
                grid[index][i] = true;
            }else{
                grid [index][i] = false;
            }
        }
    }
    
}
