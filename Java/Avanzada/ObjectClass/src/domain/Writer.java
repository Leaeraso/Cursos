package domain;

public class Writer extends Employee {

    final TypeOfWriting tow;

    public Writer(String name, double salary, TypeOfWriting tow) {
        super(name, salary);
        this.tow = tow;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "Type of writing: " + tow.getDescription();
    }

    @Override
    public String toString() {
        return "Writer{" + "tow=" + tow + '}' + " " + super.toString();
    }
    
    public TypeOfWriting getTypeOfWriting(){
        return this.tow;
    }
}
