package test;

import domain.Client;
import domain.Employee;
import java.util.Date;

public class TestInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("Leandro", 1000.0);
        System.out.println("e1 = " + e1);
//        Client c1 = new Client(new Date(), false, "Charles", 'M', 20, "Los Tamarindos 1697");
//        System.out.println("c1 = " + c1);

    }
}
