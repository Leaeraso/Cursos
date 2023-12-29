package test;

public class ArrayTest {
    public static void main(String[] args) {
        int ages[] = new int[3];
        System.out.println("ages = " + ages);
        
        ages[0] = 5;
        
        ages[1] = 12;
        
        ages[2] = 3;
        
        for(int i = 0; i < ages.length; i++){
            System.out.println("element ages " + i + " : " +ages[i]);
        }
    }
}
