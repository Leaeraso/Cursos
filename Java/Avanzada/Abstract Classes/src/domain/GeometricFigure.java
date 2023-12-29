package domain;

public abstract class GeometricFigure {
    protected String figureTipe;
    
    protected GeometricFigure(String figureTipe){
        this.figureTipe = figureTipe;
    }
    
    public abstract void draw();

    public String getFigureTipe() {
        return figureTipe;
    }

    public void setFigureTipe(String figureTipe) {
        this.figureTipe = figureTipe;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" + "figureTipe=" + figureTipe + '}';
    }
    
}
