package domain;

public class Person {
    protected String name;
    protected char gender;
    protected int age;
    protected String adress;
    
    public Person(){
        
    }
    
    public Person(String name){
        this.name = name;
    }

    public Person(String name, char gender, int age, String adress) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.adress = adress;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", adress=").append(adress);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}