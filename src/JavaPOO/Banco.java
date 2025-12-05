package JavaPOO;

public class Banco {
    String titular;
    int numeroCuenta;
    double saldo;

    public Banco() {
    }

    public Banco(String titular, int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double depo) {
        this.saldo = this.saldo + depo;
        mostrar();
    }

    public void retirar(double ret) {
        this.saldo = this.saldo - ret;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Hola " + titular + " el saldo actual de tu cuenta " + numeroCuenta + " es: " + saldo);
    }
}
