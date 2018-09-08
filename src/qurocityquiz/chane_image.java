/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qurocityquiz;

/**
 *
 * @author ACER
 */
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class chane_image  {

  public static Timer timer;
 String a[]= {"MF_IMG1","MF_IMG1","MF_IMG2","MF_IMG3","MF_IMG4"};
    public chane_image() {
        try{
        timer = new Timer();
        timer.schedule(new RemindTask(),
                       0,        //initial delay
                       1*2500);  //subsequent rate
                       //figures.main("8");
                    }
                    catch (Exception e)
                    {
                        System.err.println(e);
                    }
                       
    }

    class RemindTask extends TimerTask {
        int numWarningBeeps =5;
        public void run() {
            if (numWarningBeeps > 1) {
                ImageIcon loading = new ImageIcon(a[numWarningBeeps-1]+".jpg");
              homePage.my_label.setIcon(loading);
                numWarningBeeps--;
            } 
            else if(numWarningBeeps == 1){
                ImageIcon loading = new ImageIcon("MF_IMG5.jpg");
               homePage.my_label.setIcon(loading);
               numWarningBeeps=5;
            }
            else {
                
                
                //System.out.println("Time's up!");
                timer.cancel(); // Not necessary because
                                  // we call System.exit
                //System.exit(0);   // Stops the AWT thread 
                                  // (and everything else)
            }
        }
    }
}