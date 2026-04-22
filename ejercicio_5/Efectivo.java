package ejercicio_5;

public class Efectivo extends Pago {
    private double cantidad;

    public Efectivo(double cantidad){
        this.cantidad = cantidad;
    }

    public double getCantidad(){
        return cantidad;
    }
}
