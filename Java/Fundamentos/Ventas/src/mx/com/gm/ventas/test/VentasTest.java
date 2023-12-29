package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Producto;
import mx.com.gm.ventas.Orden;

public class VentasTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("Camisa", 50.0);
        Producto p2 = new Producto("Pantalon", 100.0);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.mostrarOrden();
        
        Producto p3 = new Producto("Zapatilass", 120.0);
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p2);
        orden2.agregarProducto(p3);
        orden2.mostrarOrden();
    }
}
