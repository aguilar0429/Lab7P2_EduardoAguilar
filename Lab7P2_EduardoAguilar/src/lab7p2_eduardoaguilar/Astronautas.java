package lab7p2_eduardoaguilar;

import java.io.Serializable;


public class Astronautas implements Serializable {
    private String id;
    private String name;
    private String apellido;
    private String nacionalidad;
    private String titulo;
    private String contextura;
    private int peso;
    private int misiones;
    private static final long SerialVersionUID = 777L;
    public Astronautas() {
    }

    public Astronautas(String id, String name, String apellido, String nacionalidad, String titulo, String contextura, int peso, int misiones) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.contextura = contextura;
        this.peso = peso;
        this.misiones = misiones;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMisiones() {
        return misiones;
    }

    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return "Astronautas: " + "ID: " + id + " Nombre: " + name + " Apellido: " + apellido + " Nacionalidad: " + nacionalidad + " Titulo: " + titulo + " Contextura: " + contextura + " Peso=" + peso + " Misiones=" + misiones ;
    }
    
    
    
}
