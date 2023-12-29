package pasoporef;

import clase.Persona;

public class PasoPorRef {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.name = "Thomas";
        System.out.println("person1 name = " + person1.name);
        person1 = changeValue(person1);
        System.out.println("person1  new name = " + person1.name);
    }
    
    public static Persona changeValue(Persona person){
        person.name = "Kevin";
        return person;
    }
}
