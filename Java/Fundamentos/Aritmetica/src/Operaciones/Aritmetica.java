package Operaciones;

public class Aritmetica {
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Executing void constructor");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Executing constructor with arguments");
    }
    
    public void plus(){
        int answer = this.a + this.b;
        System.out.println("answer = " + answer);
    }
    
    public int plusWithReturn(){
        return this.a + this.b;
    }
    
    public int plusWithArguments(int a, int b){
        this.a = a;
        this.b = b;
        //return a + b;
        return this.plusWithReturn();
    }
}
