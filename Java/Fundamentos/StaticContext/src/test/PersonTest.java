package test;

import domain.Person;

public class PersonTest {
    private int counter;
    
    public static void main(String[] args) {
        Person p1 = new Person("Jhon");
        Person p2 = new Person("Kevin");
       
        print(p1);
        
        print(p2);
        
    }
    
    public static void print(Person person){
        System.out.println("person = " + person);
    }
    
    public int getCounter(){
        print(new Person("Charles"));
        return this.counter;
    }
    
}
