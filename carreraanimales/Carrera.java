/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimales;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author EdSilva
 */
public class Carrera extends Thread {
    private JLabel eti;
    private JframeAnimales p;
  
    
    public Carrera(JLabel eti, JframeAnimales p){
        this.eti=eti;
        this.p=p;
    } 
    
    public void run(){
        int t=0, l=0;
        while (true){
        try {
            Thread.sleep(300);
                    t=p.get_tor().getLocation().x;
                    l=p.get_lib().getLocation().x;
                    if(t<p.get_meta().getLocation().x-10&&t<p.get_meta().getLocation().x-10){
                        eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                        p.repaint();
                    }else{
                        break;
                    }       
        } catch (InterruptedException ex) {
        }
        if (eti.getLocation().x>=p.get_meta().getLocation().x-10){
            if(t>l){
                JOptionPane.showMessageDialog(null, "Ganó Mbappe");
            }else if(l>t){
                JOptionPane.showMessageDialog(null, "Gano Liebre");
            }else{
                JOptionPane.showMessageDialog(null, "Empate");
            }          
        }
        } 
    }
}
