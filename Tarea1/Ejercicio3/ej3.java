import java.util.Scanner;
class CuentaBancaria{
    public String titular;
    public String nroCuenta;
    public double saldo;
    

    public CuentaBancaria(String titular, String nroCuenta, double saldo){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    public void retirar(double ingresoSalida){
        if(ingresoSalida <= saldo){
        this.saldo = this.saldo - ingresoSalida;}
        else {
            System.out.println("Error: Saldo insuficiente");
        }
    }
    public void ingresar(double ingresoSalida){
        if(ingresoSalida > 0){
            this.saldo = this.saldo + ingresoSalida;}
        else{
            System.out.println("Error: El monto a depositar debe ser mayor a 0");
        }
    }
    @Override
    public String toString() {
        return "Titular: " + titular + "\nNúmero de cuenta: " + nroCuenta + "\nSaldo: " + saldo;
    }
}
public class ej3 {

    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria("Franz","123456",1000);
        System.out.println("DATOS DE LA CUENTA");
        System.out.println(cuenta);



        System.out.print("\nIngrese monto a depositar: ");
        double deposito = lee.nextDouble();
        cuenta.ingresar(deposito);

        System.out.print("\nIngrese monto a retirar: ");
        double retiro = lee.nextDouble();
        cuenta.retirar(retiro);

        System.out.println("\nDATOS ACTUALIZADOS DE LA CUENTA");
        System.out.println(cuenta);

        lee.close();
    }
}