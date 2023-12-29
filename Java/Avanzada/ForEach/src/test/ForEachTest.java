package test;

import domain.Person;

public class ForEachTest {
    public static void main(String[] args) {
        int ages[] = {5, 6, 8, 9};
            for(int age: ages){
                System.out.println("age = " + age);
            }
            
        Person people[] = {new Person("Jhon"), new Person("Karla"), new Person("Maurice")};
        for(Person person: people){
            System.out.println("person = " + person.getName());
        }
    }
}
