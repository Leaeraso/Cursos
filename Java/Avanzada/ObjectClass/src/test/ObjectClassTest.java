package test;

import domain.Employee;

public class ObjectClassTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("Leandro", 5000.0);
        Employee e2 = new Employee("leandro", 5000.0);

        if (e1 == e2) {
            System.out.println("THe objetcs have the same reference in memory");
        } else {
            System.out.println("The objetcs have different reference in memory");
        }

        if (e1.equals(e2)) {
            System.out.println("The objects have the same content");
        } else {
            System.out.println("The objects have different content");
        }

        if (e1.hashCode() == e2.hashCode()) {
            System.out.println("The objects have the same hashcode value");
        } else {
            System.out.println("The objetcs have different hashcode value");
        }
    }
}
