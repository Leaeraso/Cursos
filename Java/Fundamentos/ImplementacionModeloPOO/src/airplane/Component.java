package airplane;

import java.util.Arrays;

public class Component {
    private double value;
    private Airplane is; //composicion
    private Component[] sub_assembly;
    private Component[] assembly; // Composición

    public Component() {

    }

    public Component(double value, Airplane is, int assembly) {
        System.out.println("Component");
        this.value = value;
        this.is = is;
        this.assembly = new Component[assembly];
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void assignAssembly(Component assem) {
        // Lógica para asignar assembly a un componente
    }

    public void assignSub_assembly(Component sub) {
        // Lógica para asignar sub-aasembly a un componente
    }

    public void isComponent(Airplane i) {
        this.is = i;
    }

    @Override
    public String toString() {
        return "Component{" + "value=" + value + ", sub_assembly=" + Arrays.toString(sub_assembly) +
               ", assembly=" + Arrays.toString(assembly) + '}';
    }
}
