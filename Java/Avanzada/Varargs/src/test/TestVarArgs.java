package test;

public class TestVarArgs {
    public static void main(String[] args) {
        printNumbers(3, 4, 5);
        printNumbers(1, 2);
        someParameters("Leandro", 8, 9, 10);
    }
    
    private static void someParameters(String name, int... numbers){
        System.out.println("Name: " + name);
        printNumbers(numbers);
    }
    
    private static void printNumbers(int... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element: " + numbers[i]);
        }
    }
}
