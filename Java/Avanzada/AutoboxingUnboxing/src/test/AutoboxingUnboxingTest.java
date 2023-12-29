package test;

public class AutoboxingUnboxingTest {

    public static void main(String[] args) {
        //Clases envolventes(Wrapper) de tipos primitivos:
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */
        
        //Autoboxing
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        
        //Unboxing
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
