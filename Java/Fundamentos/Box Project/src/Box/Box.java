package Box;

public class Box {
    int high;
    int deep;
    int width;

    public Box(){
        System.out.println("Executing empty constructor");
    }
    
    public Box(int high, int deep, int width) {
        this.high = high;
        this.deep = deep;
        this.width = width;
        System.out.println("Executing contructor with arguments");
    }
    
    public int calcVolume(){
        return this.high * this.deep * this.width;
    }
    
}
