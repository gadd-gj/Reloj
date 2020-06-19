/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author gaddiel
 */
public class ContadorHilo extends Thread {
    
    private JTextField txtSeg;
    private JTextField txtMin;
    private boolean isRun = false;
    
    public ContadorHilo (JTextField txtSeg, JTextField txtMin){
        this.txtSeg = txtSeg;
        this.txtMin = txtMin;
    }
    
    public synchronized void detener(){
        isRun=false;
    }

    @Override
    public void run() {
        isRun = true;
        long min = 0;
        while(isRun){
            
             
            try {
                
                long s = Long.parseLong(txtSeg.getText());
                s++;
                
                if (s == 60) {
                   
                    s = 0;
                    min++;
                    txtMin.setText(String.valueOf(min));
                }
                
                
                txtSeg.setText(String.valueOf(s));
                Thread.sleep(1000);
            
            } catch (InterruptedException ex) {
                Logger.getLogger(ContadorHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
    
    
}
