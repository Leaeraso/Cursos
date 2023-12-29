package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorLG = new Monitor("LG", 18);
        Teclado tecladoLG = new Teclado("bluetooth", "LG");
        Raton ratonLG = new Raton("bluetooth", "LG");
        Computadora computadoraLG = new Computadora("ComputadoraHP", monitorLG, tecladoLG, ratonLG);
        
        Orden orden_1 = new Orden();
        orden_1.agregarComputadora(computadoraHP);
        orden_1.agregarComputadora(computadoraLG);
        orden_1.mostrarOrden();
    }
}
