/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecucion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tania
 */
public class MyHilos implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyHilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
