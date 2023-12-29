package test;

import dominio.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Leandro", 1000.0, false);
        System.out.println("Person 1: " + p1);
        p1.setName("Roberto");
//        System.out.println("Name: " + p1.getName());
//        System.out.println("Salary: " + p1.getSalary());
//        System.out.println("Eliminated: " + p1.isEliminated() + " $");
        System.out.println("Person 1: " + p1.toString());
    }
}
