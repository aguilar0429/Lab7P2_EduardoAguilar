package lab7p2_eduardoaguilar;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class administrarTiempo extends Thread {
    
    private JLabel tiempo;
    private boolean avanzar;
    private boolean vive;

    public administrarTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int time = Integer.parseInt(tiempo.getText() + 1);
                tiempo.setText(String.valueOf(time)+" KM");
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }

}
