package domain;

import java.io.Serializable;
//Debe ser serializable.
public class Person implements Serializable {
    //Debe tener atributos privados.
    private String name;
    private String surname;
    //Debe tener un constructor vacio.
    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //Debe tener los metodos getters and setters de cada atributo.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + '}';
    }

}
