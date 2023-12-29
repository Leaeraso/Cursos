package domain;

public class Person {

    public static int getPeopleCounter() {
        return PeopleCounter;
    }

    public static void setPeopleCounter(int aPeopleCounter) {
        PeopleCounter = aPeopleCounter;
    }
    private int PersonId;
    private String name;
    private static int PeopleCounter;
    
    
    public Person(String name){
        this.name = name;
        //Increment the people counter
        Person.PeopleCounter++;
        this.PersonId = Person.PeopleCounter;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int PersonId) {
        this.PersonId = PersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "PersonId=" + PersonId + ", name=" + name + '}';
    }
}
