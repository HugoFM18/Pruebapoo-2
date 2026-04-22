package ejercicio_5;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(3);

        Orden orden = new Orden("7:30 PM", "Carlos", cliente);
        
        Bebida bebida = new Bebida(2, "Jugo");
        Platillo platillo = new Platillo(1, "Hamburguesa");
        
        orden.agregarProductos(bebida, platillo);
        
        orden.mostrarOrden();
        
        Credito pago = new Credito(12345678, "Visa", "12/28", "Hugo");

        double total = pago.calcularTotal(20000, 2000, 3800);

        System.out.println("Total a pagar: " + total);

        pago.hacerCargo(total);
    }
}