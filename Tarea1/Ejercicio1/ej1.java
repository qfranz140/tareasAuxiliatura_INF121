import java.util.Scanner;

class Auto{
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String color;

    public Auto( String marca, String modelo, int anio, int kilometraje, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.color = color;

    }
    
    public String kilometraje(){
        int metros;
        metros = kilometraje * 1000;
        return "El kilometraje en kilometros es: " + kilometraje + " " + " En metros es: " + metros;
    }

    public String colorCambio(String color){
        this.color = color;
        return "El nuevo color es: " + this.color;

    }
    @Override 
    public String toString(){
        return "La marca del auto es: " + marca + "\n"+ "Su  modelo es:  " + modelo + "\n" + "su año: " + anio +
        "\n"+ kilometraje()+ "\n" + "su color es: " + color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

public class ej1{
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);


        Auto car1 = new Auto("Toyota", "Hilux", 2026, 5, "rojo");
        System.out.println(car1);
        System.out.println("ingrese nuevo color");
        String colorx = lee.next();
        System.out.println(car1.colorCambio(colorx) + "\n" + car1.toString());


        Auto car2 = new Auto("Lexus", "LBX", 2010, 6, "negro");
        System.out.println(car2);
        System.out.println("ingrese nuevo color");
        String colory = lee.next();
        System.out.println(car2.colorCambio(colory) + "\n" + car2.toString());
        
        lee.close();
    }
}