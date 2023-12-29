package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona person = new Persona("Luka", "Modric");
        System.out.println("person = " + person);
        System.out.println("Person name = " + person.name);
        System.out.println("Person surname = " + person.surname);
    }
}

class Persona{
    String name;
    String surname;
    
    Persona(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println("Object Person using this: " + this);
        new Imprimir().Imprimir(this);
    }
}

class Imprimir{
    public void Imprimir(Persona person){
        System.out.println("Persona desde imprimir: " + person);
        System.out.println("Impresion del objeto actual: " + this);
    }
}