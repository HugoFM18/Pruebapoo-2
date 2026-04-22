package Semana_3;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta(Object numeroCuenta2, Object saldo2) {
        //TODO Auto-generated constructor stub
    }

    // Métodos
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double mostrarSaldo() {
        return saldo;
    }

    public String toString() {
        return "Cuenta { numeroCuenta: " + numeroCuenta + " Saldo: " + saldo + " }";
    }
}