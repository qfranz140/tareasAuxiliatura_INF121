/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaauxoct26;

/**
 *
 * @author qfranz
 */
public class Aplicacion {
    private String nombre;
    private int tamanio;

    public Aplicacion(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public Aplicacion() {
    }
    
    public String getNombre(){
        return this.nombre;
}
    public int getTamanio(){
        return this.tamanio;
    }
    @Override
    public String toString() {
        return "Aplicacion{" + "nombre=" + nombre + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
