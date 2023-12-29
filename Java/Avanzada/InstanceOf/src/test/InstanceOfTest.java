package test;

import domain.*;

public class InstanceOfTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jhon", 2500.0);
        determinateType(e1);
        
        e1 = new Manager("Karla", 6000.0, "Accounting");
        //determinateType(e1);
        
    }

    public static void determinateType(Employee e) {
        if (e instanceof Manager) {
            System.out.println("Is a type of Manager");
            Manager manager = (Manager)e;
            System.out.println("manager = " + manager.getDeparment());
            ((Manager) e).getDeparment();//Convierte e de tipo Employee a tipo Manager
        }
        else if (e instanceof Employee){
            System.out.println("Is a type of Employee");
            //Manager manager = (Manager)e;
            //System.out.println("manager = " + manager.getDeparment());
            System.out.println("e = " + e.getName());
        }
        else if (e instanceof Object){
            System.out.println("Is a type of Object");
            e.toString();
        }
    }
}
