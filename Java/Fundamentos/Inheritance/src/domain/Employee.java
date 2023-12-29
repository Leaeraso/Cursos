package domain;

public class Employee extends Person{
    private int employeeID;
    private double salary;
    private static int employeeCounter;

    public Employee(){
        this.employeeID = ++Employee.employeeCounter;
    }
    
    public Employee(String name, double salary){
        //super(name);
        this();
        this.name = name;
        this.salary = salary;
    }
    
    public int getEmployeeID(){
        return this.employeeID;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("employeeID=").append(this.employeeID);
        sb.append(", salary=").append(this.salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
