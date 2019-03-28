/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeanddate;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amaisu14
 */
public class TimeAndDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime currentTime=now();
        System.out.println(currentTime.toString());
        System.out.println(currentTime.getDayOfWeek());
        
        currentTime=currentTime.minusMonths(15);
        System.out.println(currentTime);
        
        
        try {
            FileWriter fw=new FileWriter("currentTime.txt",true);            
            fw.write("\r\n"+currentTime.toString());
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(TimeAndDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
