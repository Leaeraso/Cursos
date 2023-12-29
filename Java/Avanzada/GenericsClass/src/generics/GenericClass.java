package generics;

public class GenericClass<T> {
    
    T object;
    
    public GenericClass(T object){
        this.object = object;
    }
    
    public void getType(){
        System.out.println("The T type is: " + object.getClass().getSimpleName());
    }
}
