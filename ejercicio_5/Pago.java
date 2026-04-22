package ejercicio_5;

public abstract class Pago {
    protected double subTotal;
    protected double propina;
    protected double impuestos;

    public double calcularTotal(double subTotal, double propina, double impuestos) {
        return subTotal + propina + impuestos;
    }
}