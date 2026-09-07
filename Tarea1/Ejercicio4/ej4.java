import java.util.Scanner;

class Bus {

    public int capacidad;
    public int pasajeros;
    public double dineroRecaudado;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        pasajeros = 0;
        dineroRecaudado = 0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros = pasajeros + cantidad;
        } else {
            System.out.println("No hay suficientes asientos.");
        }
    }

    public void cobrarPasaje() {
        dineroRecaudado = pasajeros * 1.50;
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    public void mostrarDatos() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pasajeros: " + pasajeros);
        System.out.println("Dinero recaudado: Bs. " + dineroRecaudado);
        System.out.println("Asientos disponibles: " + asientosDisponibles());
    }
}

public class ej4 {

    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese la capacidad del bus: ");
        int capacidad = lee.nextInt();

        Bus bus = new Bus(capacidad);

        System.out.print("Ingrese la cantidad de pasajeros: ");
        int cantidad = lee.nextInt();

        bus.subirPasajeros(cantidad);
        bus.cobrarPasaje();
        bus.mostrarDatos();

        lee.close();
    }
}