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
import java.awt.Color;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class blackFrame extends JFrame {
    
    blackFrame()
    {
        // setTitle("HEADING");
        String a ="C:\\emploeemanagementsystem\\data";
        Path p1 = Paths.get(a);
        File f;
        f = new File(p1.toString());
        if(!f.exists())
            if(f.mkdirs())
               return;
            
        
        setSize(3000,3000);
        setLocation(0,0);
        JPanel p = new JPanel();

        p.setBackground(Color.BLACK);

        add(p);setUndecorated(true);

        setVisible(true);
        
        
        
    }
}
