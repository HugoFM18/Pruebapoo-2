package ejercicio_5;

public class Credito extends Pago {
    private int numeroTarjeta;
    private String tipo;
    private String fechaExp;
    private String nombre;

    public Credito(int numeroTarjeta, String tipo, String fechaExp, String nombre) {
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
        this.fechaExp = fechaExp;
        this.nombre = nombre;
    }

    public boolean hacerCargo(double total){
        System.out.println("Pago Realizado con tarjeta: "+ total);
        return true;
    }
    
}
