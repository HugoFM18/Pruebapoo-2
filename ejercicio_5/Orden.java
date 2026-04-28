package ejercicio_5;

public class Orden {
    private String hora;
    private String mesero;
    private Cliente cliente;
    private Bebida bebida;
    private Platillo platillo;

    public Orden(String hora, String mesero, Cliente cliente, Bebida bebida, Platillo platillo) {
        this.hora = hora;
        this.mesero = mesero;
        this.cliente = cliente;
        this.bebida = bebida;
        this.platillo = platillo;
    }

    public String agregarProductos(Bebida bebida, Platillo platillo) {
        this.bebida = bebida;
        this.platillo = platillo;
        return "Productos agregados: " + bebida.getTipo() + ", " + platillo.getTipo();
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