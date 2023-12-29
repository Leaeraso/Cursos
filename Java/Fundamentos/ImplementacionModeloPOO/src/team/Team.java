package team;

import airplane.Airplane;
import java.util.Arrays;

public class Team {
    public int number;
    public Team[] sub_team; //agregacion
    public boolean team; //En el diagrama de clases se indica que un sub_team es de 0 o un equipo, indicado con boolean 1(true) y 0(false)
    private Employee[] has;
    private Airplane[] builds;

    // Constructor del team
    public Team(int number, int has, int builds) {
        System.out.println("Team");
        this.number = number;
        this.has = new Employee[has];
        this.builds = new Airplane[builds];
    }

    public void setSub_team(Team[] sub_team) {
        this.sub_team = sub_team;
    }
    
    // Constructor del sub_team
    public Team(boolean team, int has) {
        this.team = team;
        this.has = new Employee[has];
    }
    
    public void addSubTeam(Team s) {
        // Lógica para agregar subequipos a un equipo
    }

    public void addEmployee(Employee e) {
        // Lógica para agregar empleados a un equipo/subequipo
    }

    public void addAirplane(Airplane a) {
        // Lógica para agregar aviones a un equipo
    }

    @Override
    public String toString() {
        return "Team{" + "number=" + number + ", sub_team=" + Arrays.toString(sub_team) + ", team=" + team + ", has=" + Arrays.toString(has) + ", builds=" + Arrays.toString(builds) + '}';
    }

}
