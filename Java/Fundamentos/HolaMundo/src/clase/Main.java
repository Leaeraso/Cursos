package clase;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.name = "Leandro";
        persona1.surname = "Eraso";
        persona1.returnInformation();
        
        Persona persona2 = new Persona();
        persona2.returnInformation();
        persona2.name = "Carla";
        persona2.surname = "Perez";
        persona2.returnInformation();
    }
}
