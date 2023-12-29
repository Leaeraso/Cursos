package domain;

public class Person {
    private final int idPerson;
    private static int peopleCounter;
    
    static{
        System.out.println("Executing static block");
        ++Person.peopleCounter;
    }
    
    //Initializating block non-static
    {
        System.out.println("Executing non-static block");
        this.idPerson = Person.peopleCounter++;
    }
    
    public Person(){
        System.out.println("Executing Constructor");
    }
    
    public int getIdPerson(){
        return idPerson;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + '}';
    }
    
    
}
