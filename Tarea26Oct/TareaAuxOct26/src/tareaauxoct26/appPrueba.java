/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaauxoct26;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author qfranz
 */
public class appPrueba {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pantalla p = new Pantalla();
        
        //Laptop lap = new Laptop("samsung", 0, p); esta mal
        // esta parte la comentamos solo era de prueba, en el día de la auxiliatura
        /*Laptop lap = new Laptop("samsung", 3, "lcd ips", 13, 7);
        Laptop lap1 = new Laptop("samsung", 12, "lcd ips", 13, 7);
        Laptop lap2 = new Laptop("samsung", 6, "lcd ips", 13, 7);
        Laptop lap3 = new Laptop("samsung", 24, "lcd ips", 13, 7);
        ArrayList<Laptop> vec = new ArrayList<>();
        vec.add(lap);
        vec.add(lap1);
        vec.add(lap2);
        vec.add(lap3);*/
        
        //INCISO A
        Scanner te = new Scanner(System.in);
        ArrayList<Laptop> vec = new ArrayList<>();
        int n;
        System.out.println("=== INCISO A ===");
        System.out.println("N:");
        n = te.nextInt();
        te.nextLine();
        for (int i = 0; i < n; i++) {
            String modelo;
            int cantApp;
            String tipo;
            int ancho, alto;
            System.out.println("Laptop " + (i + 1));
            System.out.println("Modelo:");
            modelo = te.nextLine();
            System.out.println("Cantidad de apps:");
            cantApp = te.nextInt();
            te.nextLine();
            System.out.println("Tipo de pantalla:");
            tipo = te.nextLine();
            System.out.println("Ancho:");
            ancho = te.nextInt();
            System.out.println("Alto:");
            alto = te.nextInt();
            te.nextLine();
            vec.add(new Laptop(modelo, cantApp, tipo, ancho, alto));
        }
        
        //inciso b
        System.out.println("=== INCISO B: laptop con mas apps ===");
        int may =0;
        for (Laptop l: vec){
            if(l.getCantApp() > may){
                may = l.getCantApp();
            }
        }
        for (Laptop l: vec){
            if(l.getCantApp() == may){
                System.out.println(l);//mostramos el objeto completo, apra eso necesitamos toString()
            }
        }
        
        //inciso c
        System.out.println("=== INCISO C: agregar app a la laptop de modelo X ===");
        String x;
        System.out.println("Modelo X:");
        x = te.nextLine();
        String nom;
        int tam;
        System.out.println("Nombre de la app:");
        nom = te.nextLine();
        System.out.println("Tamanio de la app:");
        tam = te.nextInt();
        te.nextLine();
        for(Laptop laptop: vec){
            if(laptop.getModelo() == x){
                laptop.agregaApp(new Aplicacion(nom, tam));
            }
        }
        
        //inciso d
        System.out.println("=== INCISO D: eliminar apps de laptops con pantalla de ancho Y ===");
        int y;
        System.out.println("Ancho Y:");
        y = te.nextInt();
        te.nextLine();
        for(Laptop laptop: vec){
            if(laptop.getPantalla().getAncho() == y){
                laptop.getApps().clear();
                laptop.setCantApp(laptop.getApps().size());
            }
        }
        //inciso e
        System.out.println("=== INCISO E: laptop con mas apps ===");
        int mayor =0;
        for (Laptop l: vec){
            if(l.getCantApp() > mayor){
                mayor = l.getCantApp();
            }
        }
        for (Laptop l: vec){
            if(l.getCantApp() == mayor){
                System.out.println(l);
            }
        }
        
        //inciso f
        System.out.println("=== INCISO F: apps ordenadas de cada laptop ===");
        for (Laptop laptop: vec){
            ArrayList<Aplicacion> lista = laptop.getApps();
            for (int i = 0; i < lista.size() - 1; i++){
                for (int j = 0; j < lista.size() - 1 - i; j++){
                    Aplicacion a = lista.get(j);
                    Aplicacion b = lista.get(j + 1);
                    if (a.getTamanio() < b.getTamanio() || (a.getTamanio() == b.getTamanio() && a.getNombre().compareTo(b.getNombre()) > 0)){
                        lista.set(j, b);
                        lista.set(j + 1, a);
                    }
                }
            }
            System.out.println(laptop);
            for (Aplicacion app: lista){
                System.out.println(app);
            }
        }
        
        

    }
    
}