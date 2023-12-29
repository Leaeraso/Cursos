package test;

import domain.Person;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Person people[] = new Person[2];
        
        people[0] = new Person("Jhon");
        people[1] = new Person("Mark");
        
        for(int i = 0; i < people.length; i++){
            System.out.println("Person " + i + " = " + people[i]);
        }
        
        String fruits[] = {"Orange", "Banana", "Apple"};
        for(int i = 0; i < fruits.length; i++){
            System.out.println("fruit " + i + " = " + fruits[i]);
        }
    }
}
