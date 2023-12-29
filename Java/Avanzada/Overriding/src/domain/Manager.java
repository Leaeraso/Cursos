package domain;

public class Manager extends Employee {

    private String deparment;

    public Manager(String name, double salary, String deparment) {
        super(name, salary);
        this.deparment = deparment;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails() + ", Deparment: " + this.deparment;
    }
}
