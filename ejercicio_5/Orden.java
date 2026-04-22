package ejercicio_5;

public class Orden {
    private String hora;
    private String mesero;
    private Cliente cliente;

    private Bebida bebida;
    private Platillo platillo;

    public Orden(String hora, String mesero, Cliente cliente) {
        this.hora = hora;
        this.mesero = mesero;
        this.cliente = cliente;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    public void mostrarOrden() {
        System.out.println("ORDEN");
        System.out.println("Hora: " + hora);
        System.out.println("Mesero: " + mesero);
        System.out.println("Mesa: " + cliente.getMesa());

        if (bebida != null) {
            System.out.println("Bebida: " + bebida.getTipo() + " x" + bebida.getCantidad());
        }

        if (platillo != null) {
            System.out.println("Platillo: " + platillo.getTipo() + " x" + platillo.getCantidad());
        }
    }
}