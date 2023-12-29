package domain;

public class Rectangle extends GeometricFigure{
    
    public Rectangle(String figureTipe){
        super(figureTipe);
    }
    
    @Override
    public void draw(){
        System.out.println("It's printing a: " + this.getClass().getSimpleName());
    }
}
