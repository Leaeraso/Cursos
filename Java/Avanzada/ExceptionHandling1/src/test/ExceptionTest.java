package test;

import static aritmethic.Aritmethic.division;
import exceptions.ExceptionOperation;

public class ExceptionTest {
    public static void main(String[] args) {
        int result = 0;
        try{
            result = division(10, 0);
        }catch(ExceptionOperation ex){
            System.out.println("An ExceptionOperation error has ocurred ");
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println("An Exception error has ocurred: ");
            ex.printStackTrace(System.out); //imprimir la pila de excepciones
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("The division by zero has been checked");
        }
        System.out.println("result = " + result);
    }
}
