package team;

import java.util.Arrays;

public class Employee {
    public String name;
    private Team[] team; // Agregación
    
    public Employee(){
        
    }

    public Employee(String name, int team) {
        System.out.println("Employee");
        this.name = name;
        this.team = new Team[team];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addToTeam(Team e){
        // Lógica para agregar empleados a team
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", team=" + Arrays.toString(team) + '}';
    }
}

