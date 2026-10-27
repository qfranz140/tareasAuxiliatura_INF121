/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaauxoct26;

/**
 *
 * @author qfranz
 */
public class Pantalla {
    private String tipo;
    private int alto;
    private int ancho;

    public Pantalla(String tipo, int ancho, int alto) {
        this.tipo = tipo;
        this.alto = alto;
        this.ancho = ancho;
    }

    public Pantalla() {
        this.tipo = "amoled";
        this.alto = 6;
        this.ancho = 7;
    }
    
    public int getAncho(){
        return this.ancho;
}

    @Override
    public String toString() {
        return "Pantalla{" + "tipo=" + tipo + ", alto=" + alto + ", ancho=" + ancho + '}';
    }
    
    
}
