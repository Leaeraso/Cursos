package dominio;

public class Person {
    private String name;
    private double salary;
    private boolean eliminated;
    
    public Person(String name, double salary, boolean eliminated){
        this.name = name;
        this.salary = salary;
        this.eliminated = eliminated;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public boolean isEliminated(){
        return this.eliminated;
    }
    
    public void setEliminated(boolean eliminated){
        this.eliminated = eliminated;
    }
    
    public String toString(){
        return "Person [ name: " + this.name + 
                ", salary: " + this.salary +
                ", eliminated: " + this.eliminated + "]";
    }
}
