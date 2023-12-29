package domain;

import operations.Operations;

public class OperationTest {
    public static void main(String[] args) {
        var result = Operations.plus(5, 3);
        System.out.println("result = " + result);
        
        var result2 = Operations.plus(2.0, 3);
        System.out.println("result2 = " + result2);
        
        var result3 = Operations.plus(3, 5L);
        System.out.println("result3 = " + result3);
    }
}
