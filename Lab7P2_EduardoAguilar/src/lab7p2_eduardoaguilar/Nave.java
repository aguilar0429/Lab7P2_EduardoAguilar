package lab7p2_eduardoaguilar;

import java.io.Serializable;
import java.util.ArrayList;


public class Nave implements Serializable{
    private String name;
    private String identificador;
    private int max;
    private int despeje;
    private int aterrizaje;
    private int speed;
    private int max_d;
    private int gasto;
    private int combustible;
    private int combustible2;
    private static final long SerialVersionUID = 777L;
    
    
    

    public Nave(String name, String identificador, int max, int despeje, int aterrizaje, int speed, int max_d, int gasto, int combustible,int combustible2) {
        this.name = name;
        this.identificador = identificador;
        this.max = max;
        this.despeje = despeje;
        this.aterrizaje = aterrizaje;
        this.speed = speed;
        this.max_d = max_d;
        this.gasto = gasto;
        this.combustible = combustible;
        this.combustible2 = combustible2;
        
    }

    public Nave() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDespeje() {
        return despeje;
    }

    public void setDespeje(int despeje) {
        this.despeje = despeje;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMax_d() {
        return max_d;
    }

    public void setMax_d(int max_d) {
        this.max_d = max_d;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getCombustible2() {
        return combustible2;
    }

    public void setCombustible2(int combustible2) {
        this.combustible2 = combustible2;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "Nave: " + name + " Identificador: " + identificador + " Max: " + max + " Despeje: " + despeje + " Aterrizaje: " + aterrizaje + " Speed: " + speed + " Maxima Distancia: " + max_d + " Gasto de Combustible: " + gasto + " KM/L Combustible: " + combustible + " L Combustible Reserva" + combustible2 ;
    }



 

    
    
    

    

    
    
    
    
}
