package test;

import domain.Person;

public class TestInitializationBlocks {
    public static void main(String[] args) {
        Person p_1 = new Person();
        System.out.println("p_1 = " + p_1.toString());
        System.out.println(" ");
        Person p_2 = new Person();
        System.out.println("p_2 = " + p_2.toString());
    }
}
