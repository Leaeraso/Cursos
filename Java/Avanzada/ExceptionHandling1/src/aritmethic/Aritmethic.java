package aritmethic;

import exceptions.ExceptionOperation;

public class Aritmethic {
    public static int division(int num, int den) 
            throws ExceptionOperation{
        
        if(den == 0){
            throw new ExceptionOperation("Division by zero");
        }
        
        return num / den;
    }
}
