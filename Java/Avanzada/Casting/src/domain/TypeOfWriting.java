package domain;

public enum TypeOfWriting {
    CLASIC("Handwriting"),
    MODERN("Digital writing");
    
    private final String description;
    
    private TypeOfWriting(String description){
        this.description = description;
    }
    
   public String getDescription(){
       return this.description;
   }
}
