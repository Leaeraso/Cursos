package test;

import generics.GenericClass;

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass(15);
        intObject.getType();
        
        GenericClass<String> strObject = new GenericClass("Leandro");
        strObject.getType();
    }
}
