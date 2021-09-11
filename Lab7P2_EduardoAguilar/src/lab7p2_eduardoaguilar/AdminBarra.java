package lab7p2_eduardoaguilar;

import javax.swing.JProgressBar;


public class AdminBarra implements Runnable{

    private int consumo;
    private JProgressBar progBar_c;
    private int distancia;
    private boolean avanzar;
    private int max;
    
    

    public AdminBarra(int consumo, JProgressBar b, int distancia, int max ) {
        this.consumo = consumo;
        this.progBar_c = b;
        this.distancia = distancia;
        this.max = max;
        
        
       
        avanzar =true;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    @Override
    public void run() {
        while(avanzar){
            if(avanzar){
                
                int recorrido = consumo * max;
                int maximo = progBar_c.getMaximum();
                int actual = progBar_c.getValue();
                progBar_c.setValue(actual +1);
                
                if(maximo == actual){
                    avanzar = false;
                } else if( actual >= distancia){
                    avanzar = false;
                }
                    
                
                
                    
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
