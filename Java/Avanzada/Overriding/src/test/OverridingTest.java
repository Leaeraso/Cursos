package test;

import domain.*;

public class OverridingTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jhon", 2500.0);
        //System.out.println("e1 = " + e1.getDetails());
        print(e1);
        
        Manager m1 = new Manager("Karla", 6000.0, "Accounting");
        //System.out.println("m1 = " + m1.getDetails());
        print(m1);
    }
    
    public static void print(Employee e){
        System.out.println("e = " + e.getDetails());
    }
}
