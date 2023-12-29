package domain;

import airplane.Airplane;
import airplane.Component;
import exception.ErrorObjeto;
import team.Employee;
import team.Team;

public class Main {
    public static void main(String[] args) throws ErrorObjeto {
        // Instancio la clase Employee para crear 5 empleados
        Employee emp_1 = new Employee("Juan Perez", 0);
        Employee emp_2 = new Employee("Ana Ramirez", 0);
        Employee emp_3 = new Employee("Marcos Rodriguez", 0);
        Employee emp_4 = new Employee("Martin Olivera", 0);
        Employee emp_5 = new Employee("Julieta Cesar", 0);
        
        // Instancio la clase Team para crear un team y un sub_team
        Team team_1 = new Team(1, 3, 1); // sub_team = null, has = 3, builds = 2
        Team sub_team_1 = new Team(true, 2); // has = 2
        

        // Agrego los empleados al team
        team_1.addEmployee(emp_1);
        team_1.addEmployee(emp_2);
        team_1.addEmployee(emp_3);
        team_1.addEmployee(emp_4);
        team_1.addEmployee(emp_5);
        
        // Agrego los empleados al sub_team
        sub_team_1.addEmployee(emp_1);
        sub_team_1.addEmployee(emp_2);
        
        
        // Agrego sub_team_1 al Team_1
        sub_team_1.addSubTeam(team_1);

        // Instancio la clase Component para crear componentes para el avión
        Component engine = new Component(15000.0, null, 0);
        Component bodywork = new Component(30000.0, null, 0);

        // Instancio la clase Airplane para crear un Avión
        Airplane plane = new Airplane(21, null, 2); // componentSize = 2

        // Agrego el team que construye el avión
        plane.constructBy(team_1);
        
        //Agrego componentes al avion
        plane.addComponent(engine);
        plane.addComponent(bodywork);
        
        // Especifico que son componentes del avión
        engine.isComponent(plane);
        bodywork.isComponent(plane);

        // Agrego el objeto plane al objeto Team
        team_1.addAirplane(plane);
        
        //Especifico que es construido por team_1
        plane.constructBy(team_1);
        
        // Prueba de la excepción por falta de espacio en el galpón.
//         Airplane plane1 = new Airplane(21, null, 0); // Esto lanzará una excepción
//         Airplane plane2 = new Airplane(21, null, 0); // Esto lanzará una excepción
//         Airplane plane3 = new Airplane(21, null, 0); // Esto lanzará una excepción
    }
}
