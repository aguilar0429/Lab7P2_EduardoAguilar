/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_eduardoaguilar;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author eagui
 */
public class AdminDistancia implements Runnable {
    private JLabel tiempo;
    private JLabel distance;
    private int distancia;
    private int velocidad;
    private boolean avanzar;
    private boolean vive;

    public AdminDistancia(JLabel tiempo,JLabel distance, int distancia, int velocidad, boolean avanzar, boolean vive) {
        this.tiempo = tiempo;
        this.distance = distance;
        this.distancia = distancia;
        this.velocidad = velocidad;
        avanzar = true;
        vive = true;
    }

    
    @Override
    public void run() {
        while(vive){
            if(avanzar){
                int time = Integer.parseInt(tiempo.getText());
                 distancia = (velocidad) * ( time / 60)
                ;
                distance.setText(
                        distance + " Kilometros");

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
            
        }
    }
    
}
