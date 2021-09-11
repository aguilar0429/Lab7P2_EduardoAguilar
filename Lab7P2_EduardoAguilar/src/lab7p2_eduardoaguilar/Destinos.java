package lab7p2_eduardoaguilar;

import java.io.Serializable;
import java.util.logging.Logger;


public class Destinos implements Serializable{
    private String tipo;
    private String name;
    private int distancia;
    private String superficie;
    private int saturacion;
    private static final long SerialVersionUID = 777L;
    
    public Destinos(String tipo,String name, int distancia, String superficie, int saturacion) {
        this.tipo=tipo;
        this.name = name;
        this.distancia = distancia;
        this.superficie = superficie;
        this.saturacion = saturacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(int saturacion) {
        this.saturacion = saturacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Destinos: " + "Tipo: " + tipo + " Nombre " + name + " Distancia: " + distancia + " Superficie: " + superficie + " Saturacion=" + saturacion ;
    }

   
    

    
    
    
}
