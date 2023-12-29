package mx.com.gm.ventas;

public class Orden {
    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private final static int max_Productos = 10;
    private int contadorProductos;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.max_Productos];//instanciar Producto de la clase Object
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.max_Productos){
            productos[contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos permitidos");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];
//            total += producto.getPrecio(); 
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden + "\nTotal Orden: " + this.calcularTotal() + " $. ");
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("Producto " + i + " = " + productos[i]);
        }
    }
}
