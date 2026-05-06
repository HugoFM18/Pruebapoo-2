package Ejercicio_tarea;

public class Main {
    public static void main(String[] args) {

        Producto[] inventario = {
            new Producto("Laptop", 2500.0, 5),
            new Producto("Mouse", 50.0, 20),
            new Producto("Teclado", 120.0, 10)
        };

        double totalInventario = 0;

        for (Producto p : inventario) {
            p.mostrar();
            totalInventario += p.valorTotal();
        }

        System.out.println("TOTAL DEL INVENTARIO: $" + totalInventario);
    }
}