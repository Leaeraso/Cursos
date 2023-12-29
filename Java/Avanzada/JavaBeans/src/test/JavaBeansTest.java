package test;

import domain.Person;

public class JavaBeansTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Leandro");
        p1.setSurname("Eraso");
        
        System.out.println("p1 = " + p1);
        
        System.out.println("Person name: " + p1.getName());
        System.out.println("Person surname: " + p1.getSurname());
    }
}
