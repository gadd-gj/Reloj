/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gaddiel
 */
public class Hilo extends Thread{
    
    private long timeSleep = 1;
    
    public Hilo (long timeSleep){
        this.timeSleep = timeSleep;
    }

    @Override
    public void run() {
        while(true){
            
            try {
                
                sleep(timeSleep);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            super.run();
            
        }
        
    
    }
    
    
    
}
