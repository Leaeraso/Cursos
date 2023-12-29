package test;

import domain.*;

public class CastingTest {

    public static void main(String[] args) {
        Employee e;
        
        e = new Writer("Leandro", 5000.0, TypeOfWriting.CLASIC);
        //System.out.println("e = " + e);
        
        //System.out.println("e = " + e.getDetails());
        
        //Downcasting = convertir un objeto/variable de tipo padre a tipo hijo.
        //((Writer)e).getTypeOfWriting();
        Writer w = (Writer)e;
        w.getTypeOfWriting();
        
        //Upcasting = convertir un objeto/variable de tipo hija a tipo padre, no necesita conversion explicita.
        Employee e2 = w;
        System.out.println("e2 = " + e2.getDetails());
    }
}
