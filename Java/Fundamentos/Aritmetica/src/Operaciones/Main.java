package Operaciones;

public class Main {
    public static void main(String[] args) {
        var a = 10;
        var b = 2;
        
        
        Aritmetica a1 = new Aritmetica();
        System.out.println("a1 a: " + a1.a);
        System.out.println("a1 b: " + a1.b);
        
        Aritmetica a2 = new Aritmetica(3, 1);
        System.out.println("a2 a: " + a2.a);
        System.out.println("a2 b: " + a2.b);
    }
}
