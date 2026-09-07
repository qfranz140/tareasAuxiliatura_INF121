import java.util.Scanner;

class Computadora {

    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;

    // para ubjeto1
    public Computadora() {
        marca = "HP";
        procesador = "AMD Ryzen 3";
        ram = 4;
        almacenamiento = 2000;
    }

    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public boolean ramIgual(int X) {
        return ram == X;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    // Muestra los datos de la computadora
    @Override
    public String toString() {
        return "Marca: " + marca +
               "\nProcesador: " + procesador +
               "\nRAM: " + ram + " GB" +
               "\nAlmacenamiento: " + almacenamiento + " GB";
    }
}

public class ej2 {

    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);


        Computadora compu1 = new Computadora();
        Computadora compu2 = new Computadora("Lenovo","Intel Core i5",16,1000);

        
        System.out.println("DATOS DE LA COMPUTADORA 1");
        System.out.println(compu1);
        System.out.println("\nDATOS DE LA COMPUTADORA 2");
        System.out.println(compu2);


        //Saber si Ram == X
        System.out.print("\nIngrese X para comparar con la RAM: ");
        int X = lee.nextInt();

        if (compu1.ramIgual(X)) {
            System.out.println("La RAM de la computadora 1 es igual a X.");
        } else {
            System.out.println("La RAM de la computadora 1 no es igual a X.");
        }

        if (compu2.ramIgual(X)) {
            System.out.println("La RAM de la computadora 2 es igual a X.");
        } else {
            System.out.println("La RAM de la computadora 2 no es igual a X.");
        }


        //Mostrar computaddora con más alamcenamiento
        System.out.println("\nCOMPUTADORA CON MAYOR ALMACENAMIENTO");

        if (compu1.getAlmacenamiento() > compu2.getAlmacenamiento()) {
            System.out.println(compu1);
        } else {
            System.out.println(compu2);
        }

        lee.close();
    }
}