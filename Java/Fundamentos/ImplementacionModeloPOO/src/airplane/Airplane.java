package airplane;

import exception.ErrorObjeto;
import java.util.Arrays;
import team.Team;

public class Airplane {
    public int autonomy;
    private Team by;
    private Component[] has;
    public static int contadorInstancias = 0;

    public Airplane() {

    }

    public Airplane(int autonomy, Team by, int component) throws ErrorObjeto {
        verificarInstancias();
        contadorInstancias++;
        System.out.println("Airplane");
        this.autonomy = autonomy;
        this.by = by;
        this.has = new Component[component];
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }

    public void addComponent(Component c) {
        // Lógica para agregar componentes a un avion
    }

    public void constructBy(Team t) {
        this.by = t;
    }

    private void verificarInstancias() throws ErrorObjeto {
        if (contadorInstancias >= 3) {
            throw new ErrorObjeto("Se han agotado los espacios del galpon. Ocurrio un error de tipo " + this.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "Airplane{" + "autonomy=" + autonomy + ", has=" + Arrays.toString(has) + '}';
    }
}
